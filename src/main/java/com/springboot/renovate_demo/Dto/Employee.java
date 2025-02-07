package com.springboot.renovate_demo.Dto;

import lombok.*;
//dto class
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    private String id;
    private String firstName;
    private String lastName;

}
