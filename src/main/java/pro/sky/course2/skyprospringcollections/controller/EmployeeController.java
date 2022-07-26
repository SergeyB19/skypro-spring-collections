package pro.sky.course2.skyprospringcollections.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course2.skyprospringcollections.employee.Employee;
import pro.sky.course2.skyprospringcollections.exception.EmployeeAlreadyAddedException;
import pro.sky.course2.skyprospringcollections.exception.EmployeeNotFoundException;
import pro.sky.course2.skyprospringcollections.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/add")
    public Employee add(@RequestParam("firstName") String name,
                      @RequestParam("lastName") String surname) {
        return employeeService.addEmployee(name, surname);

    }

    @GetMapping(" /remove")
    public Employee remove(@RequestParam("firstName") String name,
                         @RequestParam("lastName") String surname) {
        return employeeService.removeEmployee(name, surname);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam("firstName") String name,
                       @RequestParam("lastName") String surname) {
        return employeeService.findEmployee(name, surname);
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
}
