package View;


import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vue {
    public static void main(String[] args) {

        ApplicationContext context=new
                ClassPathXmlApplicationContext("confB.xml");

        IMetier metier= (IMetier) context.getBean("metier");
        System.out.println(metier.arnaque());
        System.out.println(metier.dopage());


    }
}
