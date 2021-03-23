package Dao;

public class DaoImp implements IDao{

    @Override
    public String getName() {
        return "hamza";
    }

    @Override
    public String getImage() {
        return "ressources/hattab.png";
    }

    @Override
    public float getPrice() {
        return 10;
    }


}
