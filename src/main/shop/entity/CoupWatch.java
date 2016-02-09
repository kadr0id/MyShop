package main.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class CoupWatch implements Serializable {
    private Integer id;
    private String nameCoupWatch;
    private Boolean available;
    private Integer amount;
    private String specificationsCoupWatch;
    private Integer price;


    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCoupWatch(){
        return nameCoupWatch;
    }
    public void setNameCoupWatch(String nameCoupWatch){
        this.nameCoupWatch = nameCoupWatch;
    }

    public Boolean getAvailable(){
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getAmount() {return amount;}
    public void setAmount(Integer amount) {this.amount = amount;}

    public String getSpecificationsCoupWatch() {return specificationsCoupWatch;}
    public void setSpecificationsCoupWatch(String specificationsCoupWatch) { this.specificationsCoupWatch = specificationsCoupWatch; }

    public Integer getPrice() {return price;}
    public void setPrice(Integer price){ this.price = price;}

  /*  public String viewAmountCoupWatch() {
        String amountProduct = AVAILABLE_FALSE;
        try {
            if (isAvailable()) {
                amountProduct=AVAILABLE_TRUE+getAmount();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return amountProduct;

    }
   */
}
