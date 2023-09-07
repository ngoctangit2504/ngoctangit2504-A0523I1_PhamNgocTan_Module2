package ss8_clean_code_and_refactoring.product_management.repository;

import ss8_clean_code_and_refactoring.product_management.model.Product;

public interface IProductRepository {
    Product[] getListProduct();
    void addProduct(Product product);
    void deleteProductById(int id);
    void editProduct(int id, Product product);
    void searchProduct(String name);
}
