package serviсe;

import Dao.DaoImp;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceImp implements Serviсe {

    private DaoImp daoImp = new DaoImp();


    @Override
    public List<Car> cars(){
        return daoImp.cars();
    }



    @Override
    public <T> List<T> getCars( List<T> arr, int count) {
        return daoImp.getCars(arr, count);
    }
}
