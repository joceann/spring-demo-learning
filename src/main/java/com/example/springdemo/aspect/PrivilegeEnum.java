package com.example.springdemo.aspect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum PrivilegeEnum {

    PR1("PR1"),
    PR2("PR2");

    private String code;
}
