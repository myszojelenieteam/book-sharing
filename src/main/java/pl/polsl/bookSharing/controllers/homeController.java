package pl.polsl.bookSharing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class homeController {

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name){
        return "hello " + name;
    }

}
