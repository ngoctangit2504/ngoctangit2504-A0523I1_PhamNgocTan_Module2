package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> displayListCustomer();

    void addCustomer(Customer customer);

    void editCustomer(String maKhachHang, Customer newCustomer);

    Customer finByMaKhachHang(String maKhachHang);
}
