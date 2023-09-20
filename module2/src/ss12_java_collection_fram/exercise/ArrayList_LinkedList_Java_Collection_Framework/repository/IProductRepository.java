package ss12_java_collection_fram.exercise.ArrayList_LinkedList_Java_Collection_Framework.repository;

import ss12_java_collection_fram.exercise.ArrayList_LinkedList_Java_Collection_Framework.model.Product;

public interface IProductRepository {
    Product[] getlistProduct();
    void addProduct(Product product);
    void editProduct(int id);
    void deleteProduct(int id);
    void searchProduct(String name);
    void sortProduct();
}
