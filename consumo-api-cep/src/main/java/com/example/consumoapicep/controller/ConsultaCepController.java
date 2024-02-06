package com.example.consumoapicep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consulta-cep")
public class ConsultaCepController {

    @GetMapping("{cep}")
    public String consultaCep(@PathVariable("cep") String cep){
        RestTemplate restTemplate = new RestTemplate();
        

    }
}
