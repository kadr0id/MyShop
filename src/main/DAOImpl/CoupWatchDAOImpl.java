package main.DAOImpl;

import main.dao.DAO;
import main.hibernate.HibernateUtil;
import main.shop.entity.CoupWatch;
import org.hibernate.Criteria;
import org.hibernate.classic.Session;

import java.util.List;

/**
 * Created by PC on 09.02.2016.
 */
public class CoupWatchDAOImpl implements DAO {
    @Override
    public List<CoupWatch> getAll() {

        List<CoupWatch> result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(CoupWatch.class);

            result = (List<CoupWatch>) criteria.list();
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
