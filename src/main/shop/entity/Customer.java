package main.shop.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {

    private Integer id;
    private String customerName;
    private Boolean active;
    private String customerEmailAdress;
    private Integer creditCart;
    private Integer sumPayment;

    public Customer() {
    }

    public Customer(String nameCustomer, String email, Integer cartNumber, Integer sumPrice) {
        this.creditCart = cartNumber;
        this.customerEmailAdress = email;
        this.customerName = nameCustomer;
        this.sumPayment = sumPrice;
    }

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

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }
    @Size(max=25)
    public Integer getCreditCart() {
        return creditCart;
    }

    public void setCreditCart(Integer creditCart) {
        this.creditCart = creditCart;
    }

    public Integer getSumPayment() {
        return sumPayment;
    }

    public void setSumPayment(Integer sumPayment) {
        this.sumPayment = sumPayment;
    }

}
