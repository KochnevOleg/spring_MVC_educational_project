package com.zaurtregulov.spring.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-employee-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails() {
//        return "show-employee-details_view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//
//        String employeeName = request.getParameter("employeeName");
//        employeeName = "Mr. " + employeeName;
//        model.addAttribute("nameAttribute", employeeName);
//
//
//        return "show-employee-details_view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String employeeName, Model model) {
//
//        employeeName = "Mr. " + employeeName;
//        model.addAttribute("nameAttribute", employeeName);
//
//        return "show-employee-details_view";
//    }


    @RequestMapping("/showDetails")
    public String showEmployeeDetails(
            @Valid @ModelAttribute("employee") Employee employee
            , BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-employee-details-view";
        } else {
            return "show-employee-details_view";
        }
    }
}
