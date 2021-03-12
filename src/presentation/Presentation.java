package presentation;

import dao.DAO;
import metier.Metier;

public class Presentation {
    public static void main (String[] args){
        DAO dao = new DAO();
        Metier metier = new Metier();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
