package main.hibernate;
import main.service.cart.Cart;
import main.shop.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {

            AnnotationConfiguration ac = new AnnotationConfiguration();

            ac.addAnnotatedClass(Cart.class).addAnnotatedClass(CoupWatch.class).addAnnotatedClass(LEDWatch.class)
                    .addAnnotatedClass(Product.class).addAnnotatedClass(SmartWatch.class).
                    addAnnotatedClass(Customer.class).addAnnotatedClass(Watch.class);

            sessionFactory = ac.configure().buildSessionFactory();
        } catch (Throwable ex) {

            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
