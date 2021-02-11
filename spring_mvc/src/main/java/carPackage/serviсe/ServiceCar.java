package carPackage.serviсe;

import carPackage.model.Car;

import java.util.List;

public interface ServiceCar {
    public List<Car> cars();
    public <T> List<T> getCars( List<T> arr, int count);
}
