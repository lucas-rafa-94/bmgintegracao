package com.soap.bmgintegracao.controller;

import com.soap.bmgintegracao.service.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bmg")
public class BmgController {
    @Autowired
    Business business;

    @PostMapping
    public void init(){
        business.bmgOrchestration();
    }
}
