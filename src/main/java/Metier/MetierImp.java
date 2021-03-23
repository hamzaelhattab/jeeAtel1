package Metier;

import Dao.DaoImp;
import Dao.IDao;

public class MetierImp implements IMetier{

    IDao dao;

    @Override
    public float arnaque() {

        return (dao.getPrice() * 100) / 3 - 90;
    }

    @Override
    public float dopage() {
        return dao.getPrice() * 17.3f;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
