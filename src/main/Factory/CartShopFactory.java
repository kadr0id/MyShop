package main.Factory;


import main.service.cart.Cart;
import main.service.cart.CartImpl;

/**
 * Created by PC on 26.02.2016.
 */
public class CartShopFactory {
    private static CartShopFactory INSTANCE;
    private static Cart cartFactory;

    public static CartShopFactory getCartShopInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CartShopFactory();
        }
        return INSTANCE;
    }

    private CartShopFactory() {
    }

    public Cart getCartFactory(CartTypes cartType) {

        switch (cartType) {
            case CARTLIST:
                if (cartFactory == null) {
                    cartFactory = new CartImpl();

                }
                break;
        }

        return cartFactory;

    }
}
