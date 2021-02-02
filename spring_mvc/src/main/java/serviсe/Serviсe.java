package serviсe;

import model.Car;

import java.util.List;

public interface Serviсe {
    public List<Car> cars();
    public <T> List<T> getCars( List<T> arr, int count);
}
