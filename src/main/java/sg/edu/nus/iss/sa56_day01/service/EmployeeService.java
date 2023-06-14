package sg.edu.nus.iss.sa56_day01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.sa56_day01.model.Employee;

@Service // represents the service class, need to import for any service class
public class EmployeeService {
    
    private List<Employee> employees = new ArrayList<Employee>();

    public EmployeeService(){
            // this one can use the @Data way?

            employees.add(new Employee("1","firstname","lastname","F"));
            employees.add(new Employee("2","Mary","Tan","F"));
            employees.add(new Employee("3","John","Tan","M"));
    }

    public List<Employee> getAllEmployees(){
        return this.employees;
    }

    public List<Employee> getEmployeesByLastName(String lastName){
        List<Employee> filterEmployees = employees.stream()
                .filter(emp -> emp.getLastName().equals(lastName)).toList();
        return filterEmployees;
    }

    public List<Employee> getEmployeesByGender(String gender){
        List<Employee> filterEmployees = employees.stream()
                .filter(emp->emp.getGender().equals(gender)).toList();
        return filterEmployees;
    }
   


}
