/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.spring.spring.capgemini.core;
        
/**
 * Reprezentacja pojedynczego elementu zamówenia.
 * 
 * @author kursant4
 */
public class OrderItem {
    
    // ilosc zamowionych produktow
    int amount;
    
    // rabat w procentach
    int discount;
    
    // zamowiony produkt
    //TODO zmienic na plyte chodnikowa
    Object product;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Object getProduct() {
        return product;
    }

    public void setProduct(Object product) {
        this.product = product;
    }
    
}
