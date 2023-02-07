package com.pedrodev.consultacpfdesafio.controller;

import com.pedrodev.consultacpfdesafio.service.CheckCpfService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultacpf")
public class CheckCpfController {

    private final CheckCpfService checkCpfService;

    public CheckCpfController(CheckCpfService checkCpfService) {
        this.checkCpfService = checkCpfService;
    }

    @GetMapping("/users/{cpf}")
    public ResponseEntity checkCpf(@PathVariable("cpf") String cpf){
        return  checkCpfService.check(cpf);
    }
}
