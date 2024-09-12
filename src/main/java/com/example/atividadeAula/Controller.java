package com.example.atividadeAula;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {

    @GetMapping(value = "/fahrenheitParaCelsius")
    public double converteFParaC(@RequestParam double f){
        double c = ( f - 32 ) / 1.8 ;
        return c;
    }

    @GetMapping(value = "/celsiusParaFahrenheit")
    public double converteCParaF(@RequestParam double c){
        double f = ( c * 1.8 ) + 32 ;
        return f;
    }
}
