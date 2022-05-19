package br.com.uri.mscheckout.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {

    private String name;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("sales_price")
    private Double salesPrice;

}
