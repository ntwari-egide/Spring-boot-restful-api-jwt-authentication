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

    // accessing by the admin only
    @GetMapping("/admin/greetings")
    public String getGreetings(){
        return "Admin , Good morning";
    }
}