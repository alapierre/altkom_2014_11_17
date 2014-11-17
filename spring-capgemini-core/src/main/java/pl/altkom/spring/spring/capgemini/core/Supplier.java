package pl.altkom.spring.spring.capgemini.core;

/**
 *
 * @author kursant7
 */
public class Supplier {
    
    private Long id;
    
    private String name;
    
    // TODO: change to type Address
    private String address;
    
    private String vatIdentificationNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVatIdentificationNumber() {
        return vatIdentificationNumber;
    }

    public void setVatIdentificationNumber(String vatIdentificationNumber) {
        this.vatIdentificationNumber = vatIdentificationNumber;
    }
    
}
