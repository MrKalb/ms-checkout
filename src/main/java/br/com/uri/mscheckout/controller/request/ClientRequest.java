package br.com.uri.mscheckout.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ClientRequest {

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String address1;

    @NotNull
    @NotBlank
    private String address2;

    private String address3;

    @NotNull
    @NotBlank
    private String zipCode;

}
