package com.hardwjj.authentication;

import com.hardwjj.authentication.auth.ApiAuthenticator;
import com.hardwjj.authentication.auth.DefaultApiAuthenticatorImpl;

/**
 * @author wjiajun
 */
public class Client {

    public static void main(String[] args) {
        String req = "req?AppID=???&Token=???&Timestamp=???";
        ApiAuthenticator apiAuthenticator = new DefaultApiAuthenticatorImpl();
        apiAuthenticator.auth(req);
    }
}
