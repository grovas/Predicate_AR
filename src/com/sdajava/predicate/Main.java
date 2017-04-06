package com.sdajava.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee e1 = new Employee(1, "Dab", 23, "Drep", "M");
        Employee e2 = new Employee(2, "Dabq", 55, "Dreasdasdp", "K");
        Employee e3 = new Employee(3, "Dabwe", 43, "Dadasdrep", "M");
        Employee e4 = new Employee(4, "Dabwe", 43, "Dadasdrep", "M");
        Employee e5 = new Employee(5, "Dabwe", 43, "Dadasdrep", "M");
        Employee e6 = new Employee(6, "Dabwe", 43, "Dadasdrep", "M");
        Employee e7 = new Employee(7, "Dabwe", 43, "Dadasdrep", "M");
        Employee e8 = new Employee(8, "Dabwe", 43, "Dadasdrep", "M");

        List<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8}));
    }
}
