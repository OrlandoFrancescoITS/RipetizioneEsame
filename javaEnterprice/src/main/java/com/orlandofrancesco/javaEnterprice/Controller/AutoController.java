package com.orlandofrancesco.javaEnterprice.Controller;

import com.orlandofrancesco.javaEnterprice.Models.Auto;
import com.orlandofrancesco.javaEnterprice.Service.AutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping()
public class AutoController {
    AutoService service;

    public AutoController(AutoService service) {
        this.service = service;
    }

    @GetMapping("/auto")
    public String getAutos(Model model){
        model.addAttribute("autos", service.autos);
        return "home";
    }
}
