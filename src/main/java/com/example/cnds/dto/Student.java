package com.example.cnds.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : wangjun
 * @date : 2021/11/19  15:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String name;
    private Integer age;


    public static void main(String[] args) {
        Student student = new Student("222",11);
        System.out.println(student.toString());

        Student name = new StudentBuilder().age(222).name("222").build();
        System.out.println(name);


    }
}
