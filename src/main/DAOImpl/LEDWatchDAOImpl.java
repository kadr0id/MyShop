package main.DAOImpl;

import main.dao.DAO;
import main.hibernate.HibernateUtil;
import main.shop.entity.LEDWatch;
import org.hibernate.Criteria;
import org.hibernate.classic.Session;

import java.util.List;

/**
 * Created by PC on 09.02.2016.
 */
public class LEDWatchDAOImpl implements DAO{
    @Override
    public List<LEDWatch> getAll() {


        List<LEDWatch> result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(LEDWatch.class);

            result = (List<LEDWatch>) criteria.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }


}
