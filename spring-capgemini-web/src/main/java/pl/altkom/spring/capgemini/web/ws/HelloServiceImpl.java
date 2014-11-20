/*
 * Copyright 2014-11-20 the original author or authors.
 */

package pl.altkom.spring.capgemini.web.ws;

import javax.jws.WebService;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
@WebService(endpointInterface = "pl.altkom.spring.capgemini.web.ws.HelloService")
public class HelloServiceImpl implements HelloService {
   
   @Override
   public String sayHallo(String name) {
       return "hallo " + name;
   }
    
}
