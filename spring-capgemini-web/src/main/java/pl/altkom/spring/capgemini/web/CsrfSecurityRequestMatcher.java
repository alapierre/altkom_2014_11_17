/*
 * Copyright 2014-11-20 the original author or authors.
 */

package pl.altkom.spring.capgemini.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.security.web.util.matcher.RequestMatcher;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
public class CsrfSecurityRequestMatcher implements RequestMatcher{

    @Override
    public boolean matches(HttpServletRequest hsr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
