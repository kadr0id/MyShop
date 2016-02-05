package main.shop.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class LEDWatch implements Serializable {
    private Integer id;
    private String nameProduct;
    private Boolean availableProduct;
    private Integer amount;
    private String specificationsProduct;
    private Integer priceProduct;


    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct(){
        return nameProduct;
    }

    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }

    public Boolean getAvailableProduct(){
        return availableProduct;
    }

    public void setAvailableProduct(Boolean availableProduct) {
        this.availableProduct = availableProduct;
    }

    public Integer getAmount() {return amount;}

    public void setAmount(Integer amount) {this.amount = amount;}

    public String getSpecifications() {return specificationsProduct;}

    public void setSpecifications(String specificationsProduct) { this.specificationsProduct = specificationsProduct; }
    public Integer getPriceProduct() {
        return priceProduct;
    }

    public void setSpecificationsProduct(Integer priceProduct){ this.priceProduct = priceProduct;}
}
