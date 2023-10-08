package ss17_io_binary_file_and_serialization.exercise.product_management.repository;

import ss17_io_binary_file_and_serialization.exercise.product_management.model.Product;

import java.util.List;

public interface IRepository {
    List<Product> displayListProduct();
    void add(Product product);
    void serch(int maSanPham);
}
