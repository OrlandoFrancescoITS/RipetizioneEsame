package com.orlandofrancesco.javaEnterprice.Controller;

import ch.qos.logback.core.model.Model;
import com.orlandofrancesco.javaEnterprice.Models.Auto;
import com.orlandofrancesco.javaEnterprice.Service.AutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auto")
public class AutoRestController {
    private AutoService service;

    public AutoRestController(AutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Auto> getAutos(){
        return service.getAutos();
    }

    @GetMapping("/{id}")
    public String getAuto(@PathVariable String id){
        return id;
    }
}
