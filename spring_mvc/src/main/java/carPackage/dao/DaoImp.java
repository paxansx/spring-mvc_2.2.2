package carPackage.dao;

import carPackage.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DaoImp implements Dao {
    @Override
    public List<Car> cars() {
        ArrayList<Car> arr = new ArrayList<>();
        arr.add(new Car("model-1","color-1",111));
        arr.add(new Car("model-2","color-2",222));
        arr.add(new Car("model-3","color-3",333));
        arr.add(new Car("model-4","color-4",444));
        arr.add(new Car("model-5","color-5",555));
        return arr;
    }

    @Override
    public <T> List<T> getCars(List<T> arr, int count) {
        return  arr.stream().limit(count).collect(Collectors.toList());
    }
}
