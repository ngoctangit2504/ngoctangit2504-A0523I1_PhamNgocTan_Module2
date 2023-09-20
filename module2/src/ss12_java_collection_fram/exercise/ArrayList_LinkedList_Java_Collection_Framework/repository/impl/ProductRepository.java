package ss12_java_collection_fram.exercise.ArrayList_LinkedList_Java_Collection_Framework.repository.impl;

import ss12_java_collection_fram.exercise.ArrayList_LinkedList_Java_Collection_Framework.model.Product;
import ss12_java_collection_fram.exercise.ArrayList_LinkedList_Java_Collection_Framework.repository.IProductRepository;

public class ProductRepository implements IProductRepository {
    private static Product[] products = new Product[10];

    static {
        products[0] = new Product(1,"Ford",1000);
        products[1] = new Product(2,"Toyota",500);
        products[2] = new Product(3,"Mazda",800);
    }

    @Override
    public Product[] getlistProduct() {
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
    public void editProduct(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {

            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                products[i] = null;
            } else {
                System.out.println("Id không khớp.");
            }
        }
    }

    @Override
    public void searchProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)) {
                System.out.println("Sản phẩm cần tìm " + products[i]);
            }
        }
    }

    @Override
    public void sortProduct() {

    }
}
