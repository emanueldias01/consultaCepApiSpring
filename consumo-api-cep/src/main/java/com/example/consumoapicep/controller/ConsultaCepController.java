package com.example.consumoapicep.controller;

import com.example.consumoapicep.dto.CepDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consulta-cep")
public class ConsultaCepController {

    @GetMapping("{cep}")
    public CepDTO consultaCep(@PathVariable("cep") String cep){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CepDTO> respostaApi = restTemplate
                .getForEntity(String.format("https://viacep.com.br/ws/%s/json/", cep),CepDTO.class);

        return respostaApi.getBody();
    }
}
