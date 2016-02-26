package main.servlets;

import main.Factory.CartShopFactory;
import main.Factory.CartTypes;
import main.service.cart.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by PC on 26.02.2016.
 */
@WebServlet(name = "addToCartServlet", urlPatterns = {"/addToCartServlet"})
public class addToCartServlet extends HttpServlet {

    public static final String NAME_ITEM = "nameItem";
    public static final String INFO_ITEM = "infoItem";
    public static final String PRICE_ITEM = "priceItem";
    public static final String TARGET = "target";

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            CartShopFactory factoryCart = CartShopFactory.getCartShopInstance();
            Cart cart = factoryCart.getCartFactory(CartTypes.CARTLIST);



            String lastItem = request.getParameter(NAME_ITEM);
            lastItem = lastItem + " " + request.getParameter(INFO_ITEM);
            cart.setLastItemFromCart(lastItem);

            Integer price = Integer.parseInt(request.getParameter(PRICE_ITEM));
            cart.setSummaryPrice(price);


            String name = request.getParameter(NAME_ITEM);
            cart.addItemToCart(lastItem, price);

            String url = request.getParameter(TARGET);



            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            request.getRequestDispatcher("error").forward(request, response);
        } finally {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
