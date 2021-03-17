package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DAO implements IDAO{
    @Override
    public double getTemperature() {
        //se connecter a la bd pour recuperer la temperature
        double data = Math.random();
        return data;
    }
}
