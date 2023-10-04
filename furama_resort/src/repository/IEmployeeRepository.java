package repository;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayListEmployee();
    void addEmployee(Employee employee);
    void editEmployee(int maNhanVien, Employee employee);
}
