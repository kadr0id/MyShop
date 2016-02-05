package main.shop.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {

    private Integer id;
    private String customerName;
    private Boolean active;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Boolean getActive(){
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
