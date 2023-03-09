package pers.xiaozhuang.onionarch.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.xiaozhuang.onionarch.application.service.TestService;

@RestController
public class TestController {
    TestService service;

    TestController(TestService service){
        this.service = service;
    }

    @GetMapping("hello")
    public String hello(){
        return service.hello();
    }

}

