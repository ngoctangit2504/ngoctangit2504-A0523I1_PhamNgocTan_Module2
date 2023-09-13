package ss8_clean_code_and_refactoring.product_management.service.impl;

import ss8_clean_code_and_refactoring.product_management.model.Product;
import ss8_clean_code_and_refactoring.product_management.repository.IProductRepository;
import ss8_clean_code_and_refactoring.product_management.repository.impl.ProductRepository;
import ss8_clean_code_and_refactoring.product_management.service.IProductService;

import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();


    @Override
    public void display() {
        Product[] products = productRepository.getListProduct();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println((1 + i) + "." + products[i]);
            }
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập tên");
        String name = scanner.nextLine();

        System.out.println("nhập giá");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập mô tả sản phẩm");
        String describe = scanner.nextLine();

        Product product = new Product(id, name, price, describe);
        productRepository.addProduct(product);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id product cần xoá");
        int deleteId = Integer.parseInt(scanner.nextLine());
        productRepository.deleteProductById(deleteId);
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id product muốn sửa");
        int editId = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập id edit");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập tên edit");
        String name = scanner.nextLine();

        System.out.println("nhập giá edit");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập mô tả sản phẩm edit");
        String describe = scanner.nextLine();

        Product product = new Product(id, name, price, describe);
        productRepository.editProduct(editId, product);
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm.");
        String searchName = scanner.nextLine();
        productRepository.searchProduct(searchName);
    }

}