package Dao;

import model.Car;

import java.util.List;

public interface Dao {
    public List<Car> cars();
    public <T> List<T> getCars( List<T> arr, int count);
}
