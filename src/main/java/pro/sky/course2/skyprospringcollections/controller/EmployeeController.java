package pro.sky.course2.skyprospringcollections.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course2.skyprospringcollections.exception.EmployeeAlreadyAddedException;
import pro.sky.course2.skyprospringcollections.exception.EmployeeNotFoundException;
import pro.sky.course2.skyprospringcollections.service.EmployeeService;

@RestController
public class EmployeeController {
    private final EmployeeService EmployeeService;

    public EmployeeController(pro.sky.course2.skyprospringcollections.service.EmployeeService employeeService) {
        EmployeeService = employeeService;
    }

@GetMapping("/employee/add?firstName=Ivan&lastName=Ivanov")
public String add(@RequestParam("firstName") String firstName,
                  @RequestParam("lastName") String lastName) {
    try {
        return firstName + " " + lastName;
    } catch (throw new EmployeeAlreadyAddedException("Cотрудник уже существует"))


}
    @GetMapping(" /employee/remove?firstName=Ivan&lastName=Ivanov")
    public String remove(@RequestParam("firstName") String firstName,
                      @RequestParam("lastName") String lastName) {
        try {
            return firstName + " " + lastName;
        } catch ( new EmployeeNotFoundException("Сотрудник отсутствует"))

    }

    @GetMapping("/employee/find?firstName=Ivan&lastName=Ivanov")
    public String find(@RequestParam("firstName") String firstName,
                         @RequestParam("lastName") String lastName) {
        try {
            return firstName + " " + lastName;
        } catch { (new EmployeeNotFoundException("Сотрудник отсутствует"))

    }
}
