package com.sdajava.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {

    public static Predicate<Employee> isAdultMale() {
        return e -> e.getAge() > 18 && e.getGender().equals("M");
    }

    public static Predicate<Employee> isAgeMorethan(Integer age) {
        return e -> e.getAge() > age;
    }

    public static List<Employee>
    filterData(List<Employee> list, Predicate<Employee> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
