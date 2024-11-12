package com.example.exerciseonespringboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercises {

    String[] names={"Alaa","Saja","Sara"};

    @GetMapping("/name")
    public String name(){
        return "My name is Alaa";
    }
    @GetMapping(path = "/age")
    public String age(){
        return "My age is 23";
    }
    @GetMapping(path = "/check/status")
    public String status(){
        return "Everything is OK";
    }
    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping(path = "/names")
    public String[] names(){
        return names;
    }
}
