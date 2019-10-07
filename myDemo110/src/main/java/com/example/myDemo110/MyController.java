package com.example.myDemo110;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //Rest for JSON get
public class MyController {

    final MyService service;

    @Autowired
    public MyController(MyService service) {
        this.service = service;
    }


    //("some page") Можно будет указать JSP страницу
    @GetMapping("/")//where to map
    public String myControllerMethod(MyDto myDto) {
        service.myServiceMethod();
        System.out.println("Calling method from Service");

        return "index"; //which view name
//        ModelAndView modelAndView = new ModelAndView("StartPage");
//        return modelAndView;
//    }

    }
    @PostMapping("/savecar")
    public void mySaveCar(@RequestBody ModelCar modelCar) {
        service.mySaveCar(modelCar);
    }
}
