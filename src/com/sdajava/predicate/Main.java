package com.sdajava.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static com.sdajava.predicate.Predicates.filterData;
import static com.sdajava.predicate.Predicates.isAdultMale;
import static com.sdajava.predicate.Predicates.isAgeMorethan;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee e1 = new Employee(1, "Dab", 23, "Drep", "M");
        Employee e2 = new Employee(2, "Dabq", 55, "Dreasdasdp", "K");
        Employee e3 = new Employee(3, "Dabwe", 43, "Dadasdrep", "M");
        Employee e4 = new Employee(4, "Dabwett", 43, "Dadasdrep", "K");
        Employee e5 = new Employee(5, "Dabweee", 15, "Dadasdrep", "M");
        Employee e6 = new Employee(6, "Dabweqwe", 44, "Dadasdrep", "K");
        Employee e7 = new Employee(7, "Dabqwewe", 43, "Dadasdrep", "M");
        Employee e8 = new Employee(8, "Dabrrwe", 13, "Dadasdrep", "K");

        List<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8}));

        //employees.forEach(System.out::println);

        System.out.println(filterData(employees, isAdultMale()));
        System.out.println(filterData(employees, isAgeMorethan(2)));
    }

}
