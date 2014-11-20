/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.spring.capgemini.jaxb;

import pl.com.softproject.commons.model.invoice.Invoice;

/**
 *
 * @author instruktor
 */
public class InvoiceSerializer extends BaseXMLSerializer<Invoice>{

    public InvoiceSerializer() {
        super("pl.com.softproject.commons.model.invoice", 
                "invoice.xsd", 
                "http://www.softproject.com.pl/commons/model/invoice http://schema.softproject.com.pl/commons/invoice.xsd");
    }
    
    
    
}
