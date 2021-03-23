package View;

import Dao.DaoImp;
import Metier.MetierImp;

public class Vue {
    public static void main(String[] args) {
        DaoImp dao = new DaoImp();
        MetierImp metierImp = new MetierImp();
        metierImp.setDao(dao);
        
        System.out.println("haha vous etes arnque : " + metierImp.arnaque());
        System.out.println("oups vous etes dope : " + metierImp.dopage());
    }
}
