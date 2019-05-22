package com.codegym.controller;

import com.codegym.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @Autowired
    Calculator calculator;

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String showAdditionForm() {
        return "add";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public String add(@RequestParam int first, @RequestParam int second, Model model) {
        int result = calculator.add(first, second);
        model.addAttribute("first", first);
        model.addAttribute("second", second);
        model.addAttribute("result", result);
        return "add";
    }

}
