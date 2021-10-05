package com.rodrigodojo.projetoaws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class testController {
    private static final Logger LOG = LoggerFactory.getLogger(testController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name){
        LOG.info("Teste de controler - name : {}", name);

        return ResponseEntity.ok("Name : "+ name);
    }
}
