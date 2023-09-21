package ss12_java_collection_fram.exercise.car_manager.controller;

import ss12_java_collection_fram.exercise.car_manager.system.ICarSystem;
import ss12_java_collection_fram.exercise.car_manager.system.impl.CarSystem;

import java.util.Scanner;

public class CarController {
    public static void displayMenu() {
        ICarSystem carSystem = new CarSystem();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Select your number :");
            System.out.println("1.Display list Car" +
                    "\n2.Add Car" +
                    "\n3.Edit Car" +
                    "\n4.Delete Car" +
                    "\n5.Search Car" +
                    "\n6.Sort List" +
                    "\n7.Exit");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Chức năng hiển thị Car");
                    carSystem.display();
                    break;
                case 2:
                    System.out.println("Chức năng thêm Car");
                    carSystem.add();
                    break;
                case 3:
                    System.out.println("Chức năng sửa Car");
                    carSystem.edit();
                    break;
                case 4:
                    System.out.println("Chức năng xóa Car");
                    carSystem.delete();
                    break;
                case 5:
                    System.out.println("Chức năng tìm kiếm Car");
                    carSystem.search();
                    break;
                case 6:
                    System.out.println("Chức năng sắp xếp List");
                    carSystem.sort();
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập lại lựa chọn của bạn.");
                    break;
            }
        } while (flag);
    }
}
