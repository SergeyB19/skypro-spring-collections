package pro.sky.course2.skyprospringcollections.service;

import org.springframework.stereotype.Service;
import pro.sky.course2.skyprospringcollections.employee.Employee;
import pro.sky.course2.skyprospringcollections.exception.EmployeeAlreadyAddedException;
import pro.sky.course2.skyprospringcollections.exception.EmployeeNotFoundException;
import pro.sky.course2.skyprospringcollections.exception.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {

    private static final int LIMIT = 10;
    private final List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    public Employee addEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        int indexForAdd = -1;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] == null) {
//                indexForAdd = i;
//                break;
//            }
            if (employees.size() < LIMIT) {
                employees.add(employee);
                return employee;
            }
                throw new EmployeeStorageIsFullException();
            }
//            if (employees[i].equals(employee)) {
//                throw new EmployeeAlreadyAddedException();
//            }
//        }
//        if (indexForAdd != -1) {
//            return employees[indexForAdd] = employee;
//        } else {
//            throw new EmployeeStorageIsFullException();
//        }
//    }
    public Employee findEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
//        for (Employee value : employees) {
//            if (Objects.equals(employee, value)) {
                return employee;
            }
//        }
//        throw new EmployeeNotFoundException();
//    }

    public Employee removeEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException(); }
//        for (int i = 0; i < employees.length; i++) {
//            if (Objects.equals(employee, employees[i])) {
//                employees[i] = null;
            employees.remove(employee);
                return employee;
        }

    public List<Employee> getAll() {
        return new ArrayList<>(employees);
    }
        }
//        throw new EmployeeNotFoundException();
//    }
//}
