package sg.edu.nus.iss.sa56_day01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.sa56_day01.model.Employee;
import sg.edu.nus.iss.sa56_day01.service.EmployeeService;

/*  Different types of mapping
RequestMapping
GetMapping - Retrieve list or single objects / entities
PostMapping - for creating new objects or records
PutMapping - to update existing object
DeleteMapping - to delete an object/record from a list/db
 */

 
//Same as service, need to import controller class first
@Controller

//when end with /employees, it will come to this controller
@RequestMapping (path = "/employees")

public class EmployeeController {
    
    @Autowired // helps to instantiate so no need to write controller to instantiate the service object
    //is a form of DI
    EmployeeService empSvc;

    //@GetMapping(value="/list")  //if /employees/list then will call this
    @GetMapping()
    public @ResponseBody List<Employee> getAllEmployees(){
        return empSvc.getAllEmployees();
        //will be in JSON structure
    }


}
