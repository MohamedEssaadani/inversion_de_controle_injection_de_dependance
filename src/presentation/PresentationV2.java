package presentation;

import dao.IDAO;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main (String[] args){

        try{

            Scanner scanner =  new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);

            IDAO dao = (IDAO)cDao.newInstance();
            
            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier)cMetier.newInstance();


            Method m = cMetier.getMethod("setDao", IDAO.class);

            m.invoke(metier, dao);

            System.out.println(metier.calcul());

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
