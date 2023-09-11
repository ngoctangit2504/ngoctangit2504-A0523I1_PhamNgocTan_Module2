package ss8_clean_code_and_refactoring.product_management.repository.impl;

import ss8_clean_code_and_refactoring.product_management.model.Product;
import ss8_clean_code_and_refactoring.product_management.repository.IProductRepository;

public class ProductRepository implements IProductRepository {
    private static Product[] products = new Product[10];

    static {
        products[0] = new Product(01, "Samsung", 20000000, "Màn hình đẹp");
        products[1] = new Product(02, "Xiaomi", 15000000, "Chíp mạnh");
        products[2] = new Product(03, "Oppo", 13000000, "Pin trâu");
    }

    @Override
    public Product[] getListProduct() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    @Override
    public void deleteProductById(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                products[i] = null;
                break;
            } else {
                System.out.println("Id không khớp");
                break;
            }
        }
    }

    @Override
    public void editProduct(int id, Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                System.out.println("Đã tìm thấy, nhập theo thứ tự để thay đổi");
                products[i] = product;
                break;
            } else {
                System.out.println("Id không khớp");
                break;
            }
        }
    }

    @Override
    public void searchProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if ((products[i].getName()).equals(name)) {
                System.out.println(products[i]);
                break;
            }
        }
    }
}