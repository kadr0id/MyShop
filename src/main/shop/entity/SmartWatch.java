package main.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class SmartWatch implements Serializable{
    private Integer id;
    private String nameSmartWatch;
    private Boolean available;
    private Integer amount;
    private String specificationsSmartWatch;
    private Integer price;


    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameSmartWatch(){
        return nameSmartWatch;
    }
    public void setNameSmartWatch(String nameSmartWatch){
        this.nameSmartWatch = nameSmartWatch;
    }

    public Boolean getAvailable(){
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getAmount() {return amount;}
    public void setAmount(Integer amount) {this.amount = amount;}

    public String getSpecificationsSmartWatch() {return specificationsSmartWatch;}
    public void setSpecificationsSmartWatch(String specificationsSmartWatch) { this.specificationsSmartWatch = specificationsSmartWatch; }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price){ this.price = price;}
}
