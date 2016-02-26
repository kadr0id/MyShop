package main.service.cart;

import java.util.List;

public interface Cart {

    public List<String> getAllNameItem();

    public List<Integer> getAllPriceItem();

    public void addItemToCart(String name, Integer Price);

    public void deleteItemFromCart(String name, Integer price);

    public String getLastItemFromCart();

    public void setLastItemFromCart(String lastItemFromCart);

    public Integer getSummaryPrice();

    public void setSummaryPrice(Integer summaryPrice);

    public Integer getCurrentId(String item);

    public void deleteAll();
}