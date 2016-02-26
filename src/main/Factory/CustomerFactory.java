package main.Factory;

import main.DAOImpl.CustomerDAOImpl;
import main.dao.CustomerDAO;

/**
 * Created by PC on 25.02.2016.
 */
public class CustomerFactory {
    private static CustomerFactory INSTANCE;
    private static CustomerDAO customerFactory;

    public static CustomerFactory getCustomerInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerFactory();
        }
        return INSTANCE;
    }

    private CustomerFactory() {
    }

    public CustomerDAO getCustomerFactory() {

        if (customerFactory == null) {
            customerFactory = new CustomerDAOImpl();
        }
        return customerFactory;
    }
}
