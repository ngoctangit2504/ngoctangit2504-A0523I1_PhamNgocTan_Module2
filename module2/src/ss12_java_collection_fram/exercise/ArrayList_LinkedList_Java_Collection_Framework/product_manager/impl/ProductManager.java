package ss12_java_collection_fram.exercise.ArrayList_LinkedList_Java_Collection_Framework.product_manager.impl;

import ss12_java_collection_fram.exercise.ArrayList_LinkedList_Java_Collection_Framework.model.Product;
import ss12_java_collection_fram.exercise.ArrayList_LinkedList_Java_Collection_Framework.product_manager.IProductManager;

import java.util.ArrayList;

public class ProductManager implements IProductManager {
    public static ArrayList<Product> arrProduct = new ArrayList<>();
    static {
        Product product1 = new Product(1,"ford",15000);
        Product product2 = new Product(2,"toyota",16000);
        Product product3 = new Product(3,"mazda",17000);
        arrProduct.add(product1);
        arrProduct.add(product2);
        arrProduct.add(product3);
    }

    @Override
    public ArrayList<Product> showListProduct() {
        return arrProduct;
    }

    @Override
    public void addProduct() {

    }
}

