package main.DAOImpl;

import main.dao.DAO;
import main.hibernate.HibernateUtil;
import main.shop.entity.Watch;
import org.hibernate.Criteria;
import org.hibernate.classic.Session;

import java.util.List;


public class WatchDAOImpl implements DAO {

    @Override
    public List<Watch> getAll() {

        List<Watch> result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(Watch.class);

            result = (List<Watch>) criteria.list();
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
