package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Presentation_Spring {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier=ctx.getBean(IMetier.class);
        System.out.println("Injection de dependance avec spring (Annotations) : ");
        System.out.println(metier.calcul());

    }
}
