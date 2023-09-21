package ss12_java_collection_fram.exercise.car_manager.system.impl;

import ss12_java_collection_fram.exercise.car_manager.model.Car;
import ss12_java_collection_fram.exercise.car_manager.repository.ICarRepository;
import ss12_java_collection_fram.exercise.car_manager.repository.impl.CarRepository;
import ss12_java_collection_fram.exercise.car_manager.system.ICarSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CarSystem implements ICarSystem {
    private ICarRepository carRepository = new CarRepository();

    @Override
    public void display() {
        ArrayList<Car> list = carRepository.getListCar();
        for (int i = 0; i < list.size(); i++) {
            if (list != null) {
                System.out.println((1 + i) + " . " + list.get(i));
            }
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên");
        String name = scanner.nextLine();
        System.out.println("Nhập Giá");
        double price = Double.parseDouble(scanner.nextLine());
        Car car = new Car(id, name, price);
        carRepository.addCar(car);
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm muốn sửa:");
        int idEdit = Integer.parseInt(scanner.nextLine());
        carRepository.editCar(idEdit);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id Car muốn xóa:");
        int idDelete = Integer.parseInt(scanner.nextLine());
        carRepository.deleteCar(idDelete);
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm kếm:");
        String nameSearch = scanner.nextLine();
        carRepository.searchCar(nameSearch);
    }

    @Override
    public void sort() {
    }
}
