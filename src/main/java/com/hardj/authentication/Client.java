package com.hardj.authentication;

import com.hardj.authentication.auth.ApiAuthenticator;
import com.hardj.authentication.auth.DefaultApiAuthenticatorImpl;

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
