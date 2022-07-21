package pro.sky.course2.skyprospringcollections.service;

import org.springframework.stereotype.Service;
import pro.sky.course2.skyprospringcollections.employee.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements EmployeeInterface {


    List<Employee> employee = new ArrayList<>(List.of(
            new Employee(" Ivanov", "Ivan"),
            new Employee(" Makarov", "Makar"),
            new Employee(" Maksimov", "Maksim"),
            new Employee(" Vasilkov", "Visaliy"),
            new Employee(" Bykin", "Gennadi"),
            new Employee(" Galkin", "Maksim"),
            new Employee(" Pygacheva", "Nadezda"),
            new Employee(" Kirkorov", "Vladimir"),
            new Employee(" Kirienko", "Viktor"),
            new Employee(" Medvedev", "Dmitriy")
    ));
}