package main.cantroller.spring;

import main.Factory.CustomerFactory;
import main.dao.CustomerDAO;
import main.shop.entity.Customer;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PC on 07.03.2016.
 */

public class CustomersController extends AbstractController {

    CustomerFactory customerDAO = CustomerFactory.getCustomerInstance();
    CustomerDAO factoryCustomer = customerDAO.getCustomerFactory();

    public CustomersController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView result;
        try {
            List<Customer> customers = factoryCustomer.getAll();

            ModelAndView mv = new ModelAndView("customers","customers",customers);
            result = mv;

        } catch (Exception e) {
            result = new ModelAndView("error");
        }
        return result;
    }
}
