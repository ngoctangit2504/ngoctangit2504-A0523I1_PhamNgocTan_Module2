package ss17_io_binary_file_and_serialization.exercise.product_management.service.impl;

import ss17_io_binary_file_and_serialization.exercise.product_management.model.Product;
import ss17_io_binary_file_and_serialization.exercise.product_management.repository.IRepository;
import ss17_io_binary_file_and_serialization.exercise.product_management.repository.impl.Repository;
import ss17_io_binary_file_and_serialization.exercise.product_management.service.IService;

import java.util.List;
import java.util.Scanner;

public class Service implements IService {
    IRepository repository = new Repository();


    @Override
    public void display() {
        List<Product> employees = repository.displayListProduct();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) != null) {
                System.out.println((1+i) + "." + employees.get(i));
            }
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma san pham...");
        int maSanPham = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham...");
        String tenSanPham = scanner.nextLine();
        System.out.println("Nhap hang san xuat...");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhap gia...");
        double gia = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap mo ta khac");
        String moTaKhac = scanner.nextLine();

        Product product = new Product(maSanPham,tenSanPham,hangSanXuat,gia,moTaKhac);
        repository.add(product);
    }

    @Override
    public void search() {

    }
}
