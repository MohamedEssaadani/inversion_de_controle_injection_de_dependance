package metier;

import dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("metier")
public class Metier implements IMetier{

    @Autowired
    private IDAO dao;

    public IDAO getDao() {
        return dao;
    }

    public void setDao(IDAO dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double temperature = dao.getTemperature();
        double resultat = temperature * 34;

        return resultat;
    }
}
