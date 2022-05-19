package br.com.uri.mscheckout.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductResult {

    @JsonProperty("body")
    private Product body;

}
