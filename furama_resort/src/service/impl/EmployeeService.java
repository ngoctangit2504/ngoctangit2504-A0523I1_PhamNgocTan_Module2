package service.impl;

import model.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements service.IEmployeeService {

    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void display() {
        List<Employee> employees = employeeRepository.displayListEmployee();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) != null) {
                System.out.println((1+i) + "." + employees.get(i));
            }
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien...");
        int maNhanVien = Integer.parseInt(scanner.nextLine());
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
        System.out.println("Nhap trinh do...");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhap vi tri...");
        String viTri = scanner.nextLine();
        System.out.println("Nhap luong...");
        double luong = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(maNhanVien,hoTen,ngaySinh,gioitinh,soCMND,soDienThoai,email,trinhDo,viTri,luong);
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void edit() {

    }
}
