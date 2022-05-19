package br.com.uri.mscheckout.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

    private String name;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("sales_price")
    private Double salesPrice;

    private String status;

}
