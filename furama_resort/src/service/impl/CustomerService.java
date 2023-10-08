package service.impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;
import java.util.Scanner;


public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();


    @Override
    public void display() {
        List<Customer> customers = customerRepository.displayListCustomer();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i) != null) {
                System.out.println((1 + i) + "." + customers.get(i));
            }
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma khach hang...");
        int maKhachHang = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ho ten...");
        String hoTen = scanner.nextLine();
        System.out.println("Nhap ngay sinh...");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhap gioi tinh...");
        String gioitinh = scanner.nextLine();
        System.out.println("Nhap so CMND...");
        int soCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dien thoai...");
        int soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap email...");
        String email = scanner.nextLine();
        System.out.println("Nhap loai khach...");
        String loaiKhach = scanner.nextLine();
        System.out.println("Nhap dia chi...");
        String diaChi = scanner.nextLine();

        Customer customer = new Customer(maKhachHang, hoTen, ngaySinh, gioitinh, soCMND, soDienThoai, email, loaiKhach, diaChi);
        customerRepository.addCustomer(customer);
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma khach hang can update");
        int maKhachhang = Integer.parseInt(scanner.nextLine());
        Customer editCustomer = customerRepository.finByMaKhachHang(maKhachhang);
        if (editCustomer != null) {
            System.out.println("Nhap NEW ho ten");
            String newHoten = scanner.nextLine();
            System.out.println("Nhap NEW ngay sinh");
            String newNgaySinh = scanner.nextLine();
            System.out.println("Nhap NEW gioi tinh");
            String newGioitinh = scanner.nextLine();
            System.out.println("Nhap NEW so CMND");
            int newSoCMND = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap NEW so dien thoi");
            int newSoDienThoai = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap NEW email");
            String newEmail = scanner.nextLine();
            System.out.println("Nhap NEW loai khach");
            String newLoaiKhach = scanner.nextLine();
            System.out.println("Nhap NEW dia chi");
            String newDiaChi = scanner.nextLine();

            editCustomer.setHoTen(newHoten);
            editCustomer.setNgaySinh(newNgaySinh);
            editCustomer.setGioiTinh(newGioitinh);
            editCustomer.setSoCMND(newSoCMND);
            editCustomer.setSoDienThoai(newSoDienThoai);
            editCustomer.setEmail(newEmail);
            editCustomer.setLoaiKhach(newLoaiKhach);
            editCustomer.setDiaChi(newDiaChi);

            customerRepository.editCustomer(maKhachhang, editCustomer);
        } else {
            System.out.println("Khong tim thay ma khach hang !");
        }
    }
}
