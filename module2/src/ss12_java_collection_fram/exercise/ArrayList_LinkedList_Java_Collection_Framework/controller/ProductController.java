package ss12_java_collection_fram.exercise.ArrayList_LinkedList_Java_Collection_Framework.controller;

public class ProductController {
    public static void displayMenu() {

        do {
            System.out.println("------ Menu ------");
            System.out.println("1.Hiển thị sản phẩm." +
                    "\n2.Thêm mới." +
                    "\n3.Sửa theo id." +
                    "\n4.Xóa theo id." +
                    "\n5.Tìm kiếm theo tên." +
                    "\n6.Sắp xếp theo giá."
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
                    System.out.println("Chức năng sửa sản phẩm theo id.");
                    productService.edit();
                    break;
                case 4:
                    System.out.println("Chức năng xoá sản phẩm theo id.");
                    productService.delete();
                    break;
                case 5:
                    System.out.println("Chức năng tìm kiếm sản phẩm theo đúng tên.");
                    productService.search();
                    break;
                case 6:
                    System.out.println("Chức năng sắp xếp sản phẩm theo giá.");
                default:
                    flag = false;
            }
        } while (flag);
    }

}
