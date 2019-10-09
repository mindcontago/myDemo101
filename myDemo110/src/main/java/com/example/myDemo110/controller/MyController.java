package com.example.myDemo110.controller;

import com.example.myDemo110.modelEntity.ModelCar;
import com.example.myDemo110.dto.MyDto;
import com.example.myDemo110.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller //Rest for JSON get
public class MyController {

    final MyService service;

    @Autowired
    public MyController(MyService service) {
        this.service = service;
    }


    //("some page") Можно будет указать JSP страницу
    @GetMapping("/home")//where to map
    public String myControllerMethod(Model model) {
        ModelCar car = service.myServiceMethod();
        model.addAttribute("myModelKey", car); //Model flyies on view

        System.out.println(car + "Calling method from Service");


        return "index"; //which view name
//        ModelAndView modelAndView = new ModelAndView("StartPage");
//        return modelAndView;
//    }

    }
//    @PostMapping("/savecar")
//    public void mySaveCar(@RequestBody ModelCar modelCar) {
//        service.mySaveCar(modelCar);
//    }
}
