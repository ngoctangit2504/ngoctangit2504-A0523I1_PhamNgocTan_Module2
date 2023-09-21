package ss12_java_collection_fram.exercise.car_manager.repository.impl;

import ss12_java_collection_fram.exercise.car_manager.model.Car;
import ss12_java_collection_fram.exercise.car_manager.repository.ICarRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRepository implements ICarRepository {
    private static ArrayList<Car> list = new ArrayList<Car>();

    static {
        Car car1 = new Car(1, "ford", 15000);
        Car car2 = new Car(2, "toyota", 16000);
        Car car3 = new Car(3, "mazda", 17000);
        list.add(car1);
        list.add(car2);
        list.add(car3);
    }


    @Override
    public ArrayList<Car> getListCar() {
        return list;
    }

    @Override
    public void addCar(Car car) {
        CarRepository.list.add(car);
    }

    @Override
    public void editCar(int id) {
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (id == (list.get(i)).getId()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Đã tìm thấy, Nhập để sửa:");
                System.out.println("Nhập tên:");
                String newName = scanner.nextLine();
                System.out.println("Nhập giá:");
                double newPrice = Double.parseDouble(scanner.nextLine());
                list.get(i).setName(newName);
                list.get(i).setPrice(newPrice);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Id không khớp");
        }
    }

    @Override
    public void deleteCar(int id) {
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (id == (list.get(i)).getId()) {
                list.remove(i);
                System.out.println("Xóa thành công.");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy Id");
        }
    }

    @Override
    public void searchCar(String name) {
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i)).getName().equals(name)) {
                System.out.println(list.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Tên tìm kiếm không đúng hoặc không có!");
        }
    }

    @Override
    public void sortListCar() {
    }
}
