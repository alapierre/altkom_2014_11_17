/*
 * Copyright 2014-11-20 the original author or authors.
 */

package pl.altkom.spring.ws.client;

import java.net.Authenticator;
import pl.altkom.spring.capgemini.web.ws.HelloServiceImplService;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
public class Main {
    
    public static void main(String[] args) {
        
        WSAuthenticator auth = new WSAuthenticator();
        auth.setUsername("user");
        auth.setPassword("user");
        
        auth.init();
        
        HelloServiceImplService srv = new HelloServiceImplService(); 
        
        String res = srv.getHelloServiceImplPort().sayHallo("Alicja");
        
        System.out.println(res);
        
    }
    
}
