package main.cantroller.spring;

import main.Factory.CartShopFactory;
import main.Factory.CartTypes;
import main.service.cart.Cart;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PC on 07.03.2016.
 */
public class CartController extends AbstractController {

    CartShopFactory factoryCart = CartShopFactory.getCartShopInstance();
    Cart cart = factoryCart.getCartFactory(CartTypes.CARTLIST);


    public CartController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView result = null;

        try {


            List<String> nameItemList = cart.getAllNameItem();
            List<Integer> priceItemList = cart.getAllPriceItem();
            ModelAndView mv = new ModelAndView("cart","name",nameItemList);
            mv.addObject("price", priceItemList);
            String lastItem=cart.getLastItemFromCart();
            Integer summaryPrice=cart.getSummaryPrice();
            mv.addObject("lastItem", lastItem);
            mv.addObject("summaryPrice", summaryPrice);

            result = mv;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
