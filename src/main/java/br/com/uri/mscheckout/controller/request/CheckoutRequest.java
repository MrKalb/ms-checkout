package br.com.uri.mscheckout.controller.request;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Data
public class CheckoutRequest {

    @NotBlank
    private String orderId;

    @NotNull
    @Valid
    private ProductRequest productRequest;

    @NotNull
    @Valid
    private ClientRequest clientRequest;

}
