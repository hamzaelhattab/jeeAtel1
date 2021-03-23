package View;

import Dao.DaoImp;
import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImp;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Vue {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("C:\\Users\\yahya\\IdeaProjects\\JeeHattab_atelier1\\src\\main\\resources\\conf.txt"));

            Class clsDao = Class.forName(sc.nextLine());
            IDao dao = (IDao) clsDao.newInstance();

            Class cslMetier = Class.forName(sc.nextLine());
            IMetier metier = (IMetier) cslMetier.newInstance();
            Method meth= cslMetier.getMethod("setDao", IDao.class);

            meth.invoke(metier,dao);

            System.out.println("haha vous etes arnque : " + metier.arnaque());
            System.out.println("oups vous etes dope : " + metier.dopage());

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
