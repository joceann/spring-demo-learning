package com.example.springdemo.commandline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)//load first before value=2
public class TestCommandLine implements CommandLineRunner {
    //execute after boot
    @Override
    public void run(String... args) throws Exception {
        System.out.println("pre-load data...........11111");
    }
}
