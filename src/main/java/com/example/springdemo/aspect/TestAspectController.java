package com.example.springdemo.aspect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAspectController {

    @RequiresPrivileges(value = {PrivilegeEnum.PR1})
    @GetMapping("test-aspect")
    public Object testAspect() {
        return "res from controller";
    }
}
