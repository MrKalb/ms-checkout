package br.com.uri.mscheckout.service;

import br.com.uri.mscheckout.client.ProductClient;
import br.com.uri.mscheckout.client.domain.Product;
import br.com.uri.mscheckout.client.domain.ProductResult;
import br.com.uri.mscheckout.controller.request.CheckoutRequest;
import br.com.uri.mscheckout.controller.request.ProductRequest;
import br.com.uri.mscheckout.entities.CheckoutEntity;
import br.com.uri.mscheckout.exception.ProductNotValidException;
import br.com.uri.mscheckout.repository.CheckoutRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class CheckoutImpl implements Checkout {

    @Autowired
    private ProductClient productClient;

    @Autowired
    private CheckoutRepository checkoutRepository;

    @Override
    public void doCheckout(CheckoutRequest checkoutRequest) {
        checkProductInventory(checkoutRequest.getProductRequest());
        CheckoutEntity entity = new CheckoutEntity();
        createEntity(checkoutRequest, entity);
        checkoutRepository.save(entity);
    }

    private void createEntity(CheckoutRequest checkoutRequest, CheckoutEntity entity) {
        entity.setProductId(checkoutRequest.getProductRequest().getProductId());
        entity.setOrderId(checkoutRequest.getOrderId());
    }

    private void checkProductInventory(ProductRequest productRequest) {
        Product product = new Product();
        createProductRequest(productRequest, product);

        ResponseEntity<ProductResult> productResult = productClient
                .validate(product);
        validateResponse(productResult);
    }

    private void validateResponse(
            ResponseEntity<ProductResult> productResult) {
        if(productResult.getStatusCode().is2xxSuccessful()) {
            if (productResult.getBody().getBody().getStatus()
                    .equalsIgnoreCase("valid")){
                return;
            }
            throw new ProductNotValidException("Product invalid");
        }
    }

    private void createProductRequest(ProductRequest productRequest,
                                      Product product) {
        product.setProductId(productRequest.getProductId());
        product.setSalesPrice(productRequest.getSalesPrice());
        product.setName(productRequest.getName());
    }
}
