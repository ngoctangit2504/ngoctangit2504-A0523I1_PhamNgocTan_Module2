package ss12_java_collection_fram.exercise.car_manager.repository;

import ss12_java_collection_fram.exercise.car_manager.model.Car;

import java.util.ArrayList;

public interface ICarRepository {
    ArrayList<Car> getListCar();
    void addCar(Car car);
    void editCar(int id);
    void deleteCar(int id);
    void searchCar(String name);
    void sortListCar();
}
