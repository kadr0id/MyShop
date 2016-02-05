package main.shop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity


public class Cart implements Serializable {
    @Column(name = "ID")
    @TableGenerator(name = "cartid", table = "cartpktb", pkColumnName = "idCart",
            pkColumnValue = "idCartValue",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "cartid")
    private Integer id;

    
}
