package repository.impl;

import model.Employee;
import repository.IEmployeeRepository;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private final String PATH_EMPLOYEE = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\furama_resort\\src\\data\\DataEmployee.csv";
    @Override
    public List<Employee> displayListEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readCSV(PATH_EMPLOYEE);
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            Employee employee = new Employee(Integer.parseInt(array[0]),array[1],array[2],array[3],Integer.parseInt(array[4]),Integer.parseInt(array[5]),array[6],array[7],array[8],Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToCSV());
        ReadAndWriteFile.writeToCSV(PATH_EMPLOYEE,stringList,true);
    }

    @Override
    public void editEmployee(int maNhanVien, Employee newEmployee) {
        boolean check = false;
        List<Employee> employeeList = displayListEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNhanVien() == maNhanVien) {
                employeeList.get(i).setHoTen(newEmployee.getHoTen());
                employeeList.get(i).setNgaySinh(newEmployee.getNgaySinh());
                employeeList.get(i).setGioiTinh(newEmployee.getGioiTinh());
                employeeList.get(i).setSoCMND(newEmployee.getSoCMND());
                employeeList.get(i).setSoDienThoai(newEmployee.getSoDienThoai());
                employeeList.get(i).setEmail(newEmployee.getEmail());
                employeeList.get(i).setTrinhDo(newEmployee.getTrinhDo());
                employeeList.get(i).setViTri(newEmployee.getViTri());
                employeeList.get(i).setLuong(newEmployee.getLuong());
                check = true;
                break;
            }
        }
        if (check) {
            List<String> stringList = new ArrayList<>();
            for (Employee employee: employeeList) {
                stringList.add(employee.getInfoToCSV());
            }
            ReadAndWriteFile.writeToCSV(PATH_EMPLOYEE,stringList,false);
        } else {
            System.out.println("Khong tim thay ma nhan vien !");
        }
    }

    public Employee finByMaNhanVien(int maNhanVien) {
        List<Employee> employeeList = displayListEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNhanVien() == maNhanVien) {
                return employeeList.get(i);
            }
        }
        return null;
    }
}
