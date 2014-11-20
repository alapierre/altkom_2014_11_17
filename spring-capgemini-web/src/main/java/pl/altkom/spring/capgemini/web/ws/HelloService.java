/*
 * Copyright 2014-11-20 the original author or authors.
 */

package pl.altkom.spring.capgemini.web.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
@WebService
public interface HelloService {

    @WebMethod
    String sayHallo(@WebParam(name = "name") String name);
    
}
