package Metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImp implements IMetier{

    @Autowired
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
