package com.zolotyh.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model) {
        String employeeName = request.getParameter("employeeName");
        employeeName = "Mr. " + employeeName;
        model.addAttribute("nameAttribute", employeeName);
        model.addAttribute("description", " - Java developer");
        return "show-emp-details-view";
    }
}
