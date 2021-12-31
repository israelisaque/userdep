package com.devjava.userdep.userdep.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String email;

    private Department department;
}
