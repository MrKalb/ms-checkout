package br.com.uri.mscheckout.exception;

public class ProductNotValidException extends RuntimeException {

    public ProductNotValidException(String msg) {
        super(msg);
    }

}
