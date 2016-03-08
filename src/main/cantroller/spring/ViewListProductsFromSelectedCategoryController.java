package main.cantroller.spring;


import main.Factory.CartShopFactory;
import main.Factory.CartTypes;
import main.Factory.DAOShopFactory;
import main.Factory.DAOTypes;
import main.dao.DAO;
import main.service.cart.Cart;
import main.shop.entity.CoupWatch;
import main.shop.entity.LEDWatch;
import main.shop.entity.SmartWatch;
import main.shop.entity.Watch;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PC on 07.03.2016.
 */
public class ViewListProductsFromSelectedCategoryController extends AbstractController {

    public static final String COUPWATCH_MODEL_NAME = "coupwatch";
    public static final String LEDWATCH_NAME = "ledwatch";
    public static final String SMARTWATCH_NAME = "smartwatch";
    public static final String WATCH_NAME = "watch";
    public static final String REQUEST_VIEW_NAME="nameView";
    public static final String NCOUPWATCH_VIEW_NAME = "oupwatch";
    public static final String LEDWATCH_VIEW_NAME = "ledwatch";
    public static final String SMARTWATCH_VIEW_NAME = "smartwatch";
    public static final String WATCH_VIEW_NAME = "watch";
    DAOShopFactory factoryDAO = DAOShopFactory.getInstance();
    CartShopFactory factoryCart = CartShopFactory.getCartShopInstance();
    Cart cart = factoryCart.getCartFactory(CartTypes.CARTLIST);
    DAO coupwatch = factoryDAO.getDAOFactory(DAOTypes.COUPWATCH);
    DAO ledwatch = factoryDAO.getDAOFactory(DAOTypes.LEDWATCH);
    DAO smartwatch = factoryDAO.getDAOFactory(DAOTypes.SMARTWATCH);
    DAO watch = factoryDAO.getDAOFactory(DAOTypes.WATCH);

    public ViewListProductsFromSelectedCategoryController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView result = null;
        try {

            List<CoupWatch> listCoupWatch = coupwatch.getAll();
            List<LEDWatch> listLEDWatch = ledwatch.getAll();
            List<SmartWatch> listSmartWatch = smartwatch.getAll();
            List<Watch> listWatch = watch.getAll();


            ModelAndView mv = new ModelAndView();
            mv.addObject(COUPWATCH_MODEL_NAME, listCoupWatch);
            mv.addObject(LEDWATCH_NAME, listLEDWatch);
            mv.addObject(SMARTWATCH_NAME, listSmartWatch);
            mv.addObject(WATCH_NAME, listWatch);

            result=mv;
        } catch (Exception ex) {
            result = new ModelAndView("error");
        }

        return result;
    }
}
