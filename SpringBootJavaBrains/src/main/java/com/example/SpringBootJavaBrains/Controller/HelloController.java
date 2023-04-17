package com.example.SpringBootJavaBrains.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

        @GetMapping("/")
        public String sayHi(){
            return "Hello World";
        }


}
