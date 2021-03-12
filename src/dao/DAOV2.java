package dao;

public class DAOV2 implements IDAO{
    @Override
    public double getTemperature() {
        //se connecter a un webserive pour recuperer la temperature
        double data = 22;
        return data;
    }
}
