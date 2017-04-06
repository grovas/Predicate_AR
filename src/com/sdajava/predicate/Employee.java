package com.sdajava.predicate;

/**
 * Created by RENT on 2017-04-06.
 */
public class Employee {

    private int id;
    private String lastName;
    private int age;
    private String firstName;
    private String gender;

    public Employee(int id, String lastName, int age, String firstName, String gender) {
        this.id = id;
        this.lastName = lastName;
        this.age = age;
        this.firstName = firstName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
