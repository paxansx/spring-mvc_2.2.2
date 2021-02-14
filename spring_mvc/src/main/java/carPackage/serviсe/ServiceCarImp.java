package carPackage.serviсe;

import carPackage.dao.Dao;
import carPackage.model.Car;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ServiceCarImp implements ServiceCar {
    private final Dao daoImp;

    public ServiceCarImp(Dao daoImp) {
        this.daoImp = daoImp;
    }


    @Override

    public List<Car> cars(){
        return daoImp.cars();
    }



    @Override
    @Transactional
    public <T> List<T> getCars( List<T> arr, int count) {
        return daoImp.getCars(arr, count);
    }
}
