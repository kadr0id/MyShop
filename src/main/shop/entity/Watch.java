package main.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Watch implements Serializable {
    private Integer id;
    private String nameWatch;
    private Boolean available;
    private Integer amount;
    private String specificationsWatch;
    private Integer price;


    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameWatch(){
        return nameWatch;
    }
    public void setNamev(String nameWatch){
        this.nameWatch = nameWatch;
    }

    public Boolean getAvailable(){
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getAmount() {return amount;}
    public void setAmount(Integer amount) {this.amount = amount;}

    public String getSpecificationsWatch() {return specificationsWatch;}
    public void setSpecificationsWatch(String specificationsWatch) { this.specificationsWatch = specificationsWatch; }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price){ this.price = price;}
}
