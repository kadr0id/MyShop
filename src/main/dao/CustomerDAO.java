package main.dao;

import main.shop.entity.Customer;
import main.shop.entity.CustomerOrder;

import java.util.List;


public interface CustomerDAO {
    public List getAll();
    public void addCustomer(Customer customer);
    public List getItemsByIdCustomer(Integer customerId);
    public void addCustomerOrder(CustomerOrder order);
}
