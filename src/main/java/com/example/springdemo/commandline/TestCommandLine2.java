package com.example.springdemo.commandline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)//load first after value=1
public class TestCommandLine2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("pre-load data...........222222");
    }
}
