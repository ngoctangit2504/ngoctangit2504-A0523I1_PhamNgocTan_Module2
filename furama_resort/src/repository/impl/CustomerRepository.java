package repository.impl;

import model.Customer;
import model.Employee;
import repository.ICustomerRepository;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String PATH_CUSTOMER = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\furama_resort\\src\\data\\DataCustomer.csv";


    @Override
    public List<Customer> displayListCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readCSV(PATH_CUSTOMER);
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            Customer customer = new Customer(Integer.parseInt(array[0]),array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoToCSV());
        ReadAndWriteFile.writeToCSV(PATH_CUSTOMER,stringList,true);
    }

    @Override
    public void editCustomer(int maKhachHang, Customer newCustomer) {
        boolean check = false;
        List<Customer> customerList = displayListCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaKhachHang() == maKhachHang) {
                customerList.get(i).setHoTen(newCustomer.getHoTen());
                customerList.get(i).setNgaySinh(newCustomer.getNgaySinh());
                customerList.get(i).setGioiTinh(newCustomer.getGioiTinh());
                customerList.get(i).setSoCMND(newCustomer.getSoCMND());
                customerList.get(i).setSoDienThoai(newCustomer.getSoDienThoai());
                customerList.get(i).setEmail(newCustomer.getEmail());
                customerList.get(i).setLoaiKhach(newCustomer.getDiaChi());
                customerList.get(i).setDiaChi(newCustomer.getDiaChi());
                check = true;
                break;
            }
        }
        if (check) {
            List<String> stringList = new ArrayList<>();
            for (Customer customer: customerList) {
                stringList.add(customer.getInfoToCSV());
            }
            ReadAndWriteFile.writeToCSV(PATH_CUSTOMER,stringList,false);
        } else {
            System.out.println("Khong tim thay ma khach hang !");
        }
    }

    @Override
    public Customer finByMaKhachHang(int maKhachHang) {
        List<Customer> customerList = displayListCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaKhachHang() == maKhachHang) {
                return customerList.get(i);
            }
        }
        return null;
    }
}
