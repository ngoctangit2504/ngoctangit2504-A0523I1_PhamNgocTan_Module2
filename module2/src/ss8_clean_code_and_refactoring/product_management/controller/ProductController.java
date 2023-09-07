package ss8_clean_code_and_refactoring.product_management.controller;

import ss8_clean_code_and_refactoring.product_management.service.IProductService;
import ss8_clean_code_and_refactoring.product_management.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenu() {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display" +
                    "\n2.Add" +
                    "\n3.Edit" +
                    "\n4.Delete" +
                    "\n5.Search" +
                    "\n6.Exit"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chức năng hiển thị sản phẩm.");
                    productService.display();
                    break;
                case 2:
                    System.out.println("Chức năng thêm mới sản phẩm.");
                    productService.add();
                    break;
                case 3:
                    System.out.println("Chức năng sửa sản phẩm.");
                    productService.edit();
                    break;
                case 4:
                    System.out.println("Chức năng xoá sản phẩm.");
                    productService.delete();
                    break;
                case 5:
                    System.out.println("Chức năng tìm kiếm sản phẩm theo đúng tên");
                    productService.search();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
