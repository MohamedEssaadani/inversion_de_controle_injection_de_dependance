package metier;

import dao.IDAO;

public class Metier implements IMetier{
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
