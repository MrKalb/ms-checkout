package br.com.uri.mscheckout.client;

import br.com.uri.mscheckout.client.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "product", url = "http://localhost:8000")
public interface ProductClient {

    @PostMapping("/v1/products/validate")
    ResponseEntity<?> validate(@RequestBody Product product);

}
