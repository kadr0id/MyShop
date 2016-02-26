package main.Factory;

import main.DAOImpl.CoupWatchDAOImpl;
import main.DAOImpl.LEDWatchDAOImpl;
import main.DAOImpl.SmartWatchDAOImpl;
import main.DAOImpl.WatchDAOImpl;
import main.dao.DAO;

/**
 * Created by PC on 25.02.2016.
 */
public class DAOShopFactory {
    private static DAOShopFactory INSTANCE;

    public static DAOShopFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DAOShopFactory();
        }
        return INSTANCE;
    }

    private DAOShopFactory() {
    }

    public DAO getDAOFactory(DAOTypes daoType) {
        DAO result = null;
        switch (daoType) {

            case Watch:
                result = new WatchDAOImpl();
                break;

            case LEDWatch:
                result = new LEDWatchDAOImpl();
                break;

            case CoupWatch:
                result = new CoupWatchDAOImpl();
                break;

            case SmartWatch:
                result = new SmartWatchDAOImpl();
                break;
        }


        return result;
    }
}
