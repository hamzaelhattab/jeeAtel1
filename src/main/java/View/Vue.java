package View;


import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vue {
    public static void main(String[] args) {

        ApplicationContext ctx=new AnnotationConfigApplicationContext("dao","metier");

        IMetier metier = ctx.getBean(IMetier.class);

        System.out.println(metier.arnaque());
        System.out.println(metier.dopage());


    }
}
