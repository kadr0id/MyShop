package main.shop.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity


public class Cart implements Serializable {
    @TableGenerator(name = "cartid", table = "cartpktb", pkColumnName = "idCart",
            pkColumnValue = "idCartValue",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "cartid")
    private Integer id;
    private String nameItem;
    private Integer price;

    public Cart() {
    }

    public Cart( String nameItem, int price) {

        this.nameItem = nameItem;
        this.price = price;
    }

    public Cart(Integer id,String nameItem, int price) {
        this.id=id;
        this.nameItem = nameItem;
        this.price = price;
    }

    public Cart(Integer id) {
        this.id = id;
    }
    @Id
    @Size(max=25)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
