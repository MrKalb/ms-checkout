package br.com.uri.mscheckout.controller.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ProductRequest {

    @NotNull
    @NotBlank
    private String productId;

    @Min(value = 0, message = "O valor não pode ser 0 ou negativo")
    private Double salesPrice;

    @NotNull
    @NotBlank
    private String name;




}
