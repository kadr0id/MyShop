package main.shop.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class LEDWatch implements Serializable {
    private Integer id;
    private String nameLEDWatch;
    private Boolean available;
    private Integer amount;
    private String specificationsLEDWatch;
    private Integer price;


    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameLEDWatch(){
        return nameLEDWatch;
    }
    public void setNameLEDWatch(String nameLEDWatch){
        this.nameLEDWatch = nameLEDWatch;
    }

    public Boolean getAvailable(){
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getAmount() {return amount;}
    public void setAmount(Integer amount) {this.amount = amount;}

    public String getSpecificationsLEDWatch() {return specificationsLEDWatch;}
    public void setSpecificationsLEDWatch(String specificationsLEDWatch) { this.specificationsLEDWatch = specificationsLEDWatch; }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price){ this.price = price;}
}
