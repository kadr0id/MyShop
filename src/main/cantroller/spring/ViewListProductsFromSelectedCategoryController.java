package main.cantroller.spring;

import main.Factory.CartShopFactory;
import main.Factory.CartTypes;
import main.Factory.DAOShopFactory;
import main.Factory.DAOTypes;
import main.dao.DAO;
import main.service.cart.Cart;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PC on 07.03.2016.
 */
public class ViewListProductsFromSelectedCategoryController extends AbstractController {

    public static final String NOTEBOOK_MODEL_NAME = "notebook";
    public static final String CAMERA_MODEL_NAME = "camera";
    public static final String CABLE_MODEL_NAME = "cable";
    public static final String REQUEST_VIEW_NAME="nameView";
    public static final String NOTEBOOK_VIEW_NAME = "notebook";
    public static final String CAMERA_VIEW_NAME = "camera";
    public static final String CABLE_VIEW_NAME = "cable";
    DAOShopFactory factoryDAO = DAOShopFactory.getInstance();
    CartShopFactory factoryCart = CartShopFactory.getCartShopInstance();
    Cart cart = factoryCart.getCartFactory(CartTypes.CARTLIST);
    DAO notebook = factoryDAO.getDAOFactory(DAOTypes.NOTEBOOK);
    DAO camera = factoryDAO.getDAOFactory(DAOTypes.CAMERA);
    DAO cable = factoryDAO.getDAOFactory(DAOTypes.CABLE);

    public ViewListProductsFromSelectedCategoryController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView result = null;
        try {

            List<Notebook> listNotebook = notebook.getAll();
            List<Camera> listCamera = camera.getAll();
            List<Cable> listCable = cable.getAll();

            ModelAndView mv = new ModelAndView();
            mv.addObject(CABLE_MODEL_NAME, listCable);
            mv.addObject(CAMERA_MODEL_NAME, listCamera);
            mv.addObject(NOTEBOOK_MODEL_NAME, listNotebook);

            result=mv;
        } catch (Exception ex) {
            result = new ModelAndView("error");
        }

        return result;
    }
}
