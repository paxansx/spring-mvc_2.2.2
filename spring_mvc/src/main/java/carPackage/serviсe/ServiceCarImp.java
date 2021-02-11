package carPackage.serviсe;

import carPackage.dao.Dao;
import carPackage.model.Car;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
@Service
public class ServiceCarImp implements ServiceCar {
    private final Dao daoImp;

    public ServiceCarImp(Dao daoImp) {
        this.daoImp = daoImp;
    }


    @Override
    @Transient
    public List<Car> cars(){
        return daoImp.cars();
    }



    @Override
    @Transient
    public <T> List<T> getCars( List<T> arr, int count) {
        return daoImp.getCars(arr, count);
    }
}
