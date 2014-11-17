/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.spring.spring.capgemini.core.model;

import java.util.List;

/**
 *
 * @author kursant2
 */
public class Order {
    
    private List<OrderItem> orderList;
    private Address adres;
    private Customer customer;
    private Invoice invoice;
    private User user;
    private Shipment shipment;
    private List<Supplier> suplierList;

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void addOrderItem(OrderItem item)
    {
        orderList.add(item);
    }
    
    public void addSupplier(Supplier item)
    {
        suplierList.add(item);
    }

    public void setOrderList(List<OrderItem> orderList) {
        this.orderList = orderList;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public void setSuplierList(List<Supplier> suplierList) {
        this.suplierList = suplierList;
    }
    
    
    public void setUser(User user) {
        this.user = user;
    }

    public void setAdres(Address adres) {
        this.adres = adres;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getOrderList() {
        return orderList;
    }

    public Address getAdres() {
        return adres;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Supplier> getSuplierList() {
        return suplierList;
    }
    
        public User getUser() {
        return user;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public Invoice getInvoice() {
        return invoice;
    }
    
    
    
    
}
