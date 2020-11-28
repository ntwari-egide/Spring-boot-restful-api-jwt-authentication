package com.techgeeknext.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
public class EmployeeController {
//    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    @GetMapping("/greetings")
    public String getEmployees() {
        return "Welcome!";
    }
}