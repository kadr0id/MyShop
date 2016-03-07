package main.cantroller.spring;

import main.Factory.CustomerFactory;
import main.dao.CustomerDAO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PC on 07.03.2016.
 */
public class ViewItemsController extends AbstractController {

    CustomerFactory customerDAO= CustomerFactory.getCustomerInstance();
    CustomerDAO factoryCustomer = customerDAO.getCustomerFactory();
    public static final String ID = "idCustomer";

    public ViewItemsController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView result;
        try {
            Integer id = Integer.parseInt(request.getParameter(ID));
            List items = factoryCustomer.getItemsByIdCustomer(id);

            ModelAndView mv = new ModelAndView("viewItems","items",items);
            result = mv;

        } catch (Exception e) {
            result = new ModelAndView("error");
        }
        return result;
    }
}
