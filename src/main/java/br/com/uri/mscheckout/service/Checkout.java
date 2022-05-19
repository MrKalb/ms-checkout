package br.com.uri.mscheckout.service;

import br.com.uri.mscheckout.controller.request.CheckoutRequest;

public interface Checkout {

    void doCheckout(CheckoutRequest checkoutRequest);

}
