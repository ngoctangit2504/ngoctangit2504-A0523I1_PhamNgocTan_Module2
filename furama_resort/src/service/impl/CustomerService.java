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

        String regexMaKhachHang = "^[K][H][-][0-9]{4}$";
        System.out.println("Nhap ma khach hang...");
        String maKhachHang = scanner.nextLine();
        boolean checkMaKhachhang = true;
        checkMaKhachhang = maKhachHang.matches(regexMaKhachHang);
        if (checkMaKhachhang == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ma khach hang...");
                String maKhachHangFix = scanner.nextLine();
                if (maKhachHangFix.matches(regexMaKhachHang)) {
                    flag = false;
                    maKhachHang = maKhachHangFix;
                }
            }
        }

        String regexHoTen = "^([A-Z][a-z]{1,}[ ]{0,}){1,}$";
        System.out.println("Nhap ho ten...");
        String hoTen = scanner.nextLine();
        boolean checkHoTen = true;
        checkHoTen = hoTen.matches(regexHoTen);
        if (checkHoTen == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ho ten...");
                String hoTenFix = scanner.nextLine();
                if (hoTenFix.matches(regexHoTen)) {
                    flag = false;
                    hoTen = hoTenFix;
                }
            }
        }

        System.out.println("Nhap ngay sinh...");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhap gioi tinh...");
        String gioitinh = scanner.nextLine();

        String regexSoCMND = "^([0-9]{9}|[0-9]{12})$";
        System.out.println("Nhap so CMND...");
        String soCMND = scanner.nextLine();
        boolean checkSoCMND = true;
        checkSoCMND = soCMND.matches(regexSoCMND);
        if (checkSoCMND == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai so CMND...");
                String soCMNDFix = scanner.nextLine();
                if (soCMNDFix.matches(regexSoCMND)) {
                    flag = false;
                    soCMND = soCMNDFix;
                }
            }
        }

        String regexSoDienThoai = "^[0][0-9]{9}$";
        System.out.println("Nhap so dien thoai...");
        String soDienThoai = scanner.nextLine();
        boolean checkSoDienThoai = true;
        checkSoDienThoai = soDienThoai.matches(regexSoDienThoai);
        if (checkSoDienThoai == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai so dien thoai...");
                String soDienThoaiFix = scanner.nextLine();
                if (soDienThoaiFix.matches(regexSoDienThoai)) {
                    flag = false;
                    soDienThoai = soDienThoaiFix;
                }
            }
        }

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
        String maKhachhang = scanner.nextLine();
        Customer editCustomer = customerRepository.finByMaKhachHang(maKhachhang);
        if (editCustomer != null) {
            System.out.println("Nhap NEW ho ten");
            String newHoten = scanner.nextLine();
            System.out.println("Nhap NEW ngay sinh");
            String newNgaySinh = scanner.nextLine();
            System.out.println("Nhap NEW gioi tinh");
            String newGioitinh = scanner.nextLine();
            System.out.println("Nhap NEW so CMND");
            String newSoCMND = scanner.nextLine();
            System.out.println("Nhap NEW so dien thoi");
            String newSoDienThoai = scanner.nextLine();
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
