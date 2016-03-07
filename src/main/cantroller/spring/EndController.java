package main.cantroller.spring;

import main.Factory.CartShopFactory;
import main.Factory.CartTypes;
import main.Factory.CustomerFactory;
import main.dao.CustomerDAO;
import main.service.cart.Cart;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by PC on 07.03.2016.
 */
public class EndController extends AbstractController {

    CartShopFactory factoryCart = CartShopFactory.getCartShopInstance();
    Cart cart = factoryCart.getCartFactory(CartTypes.CARTLIST);
    CustomerFactory factoryCustomer = CustomerFactory.getCustomerInstance();
    CustomerDAO order = factoryCustomer.getCustomerFactory();
    private static final String NO_ITEM="Вы еще не добавили ни одной вещи";
    private static final String URL="helloPage.htm";
    public EndController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        try {
            cart.setSummaryPrice(0);
            cart.setLastItemFromCart(NO_ITEM);
            cart.deleteAll();

            request.getRequestDispatcher(URL).forward(request, response);
        } catch (Exception e) {
        }
        return null;
    }
}