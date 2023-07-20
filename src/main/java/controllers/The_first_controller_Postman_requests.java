package controllers;

import jakarta.servlet.http.PushBuilder;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController

public class The_first_controller_Postman_requests {
    @GetMapping("/hello")
    public String returnStringa(){
        return "Hello World";
    };

    @GetMapping ("/greeting\"")
    public ResponseEntity<String> returnStringa2(){
        return new ResponseEntity("Good Afternoon!", HttpStatusCode.valueOf(200));
    };

    @GetMapping("/info")
    public ResponseEntity<String> returnStringOk(){
        return ResponseEntity.ok().build();
    };

    @GetMapping("/random")
    public ResponseEntity <String> returnStringa3(){
        boolean random = new Random().nextBoolean();
        if(random){
            return ResponseEntity.ok().body("Ciao");
        } else {
            return ResponseEntity.badRequest().body("Errore");
        }
    };
}

