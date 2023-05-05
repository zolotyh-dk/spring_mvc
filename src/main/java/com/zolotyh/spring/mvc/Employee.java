package com.zolotyh.spring.mvc;

import java.util.HashMap;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private HashMap<String, String> departments;
    private String car;
    private HashMap<String, String> cars;
    private String[] languages;

    private HashMap<String, String> languageList;


    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        cars = new HashMap<>();
        cars.put("BMW", "BMW");
        cars.put("Audi", "Audi");
        cars.put("Mercedes-Benz", "MB");

        languageList = new HashMap<>();
        languageList.put("EN", "English");
        languageList.put("DE", "Deutsche");
        languageList.put("FR", "French");
    }

    public HashMap<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(HashMap<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public HashMap<String, String> getCars() {
        return cars;
    }

    public void setCars(HashMap<String, String> cars) {
        this.cars = cars;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public HashMap<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(HashMap<String, String> languageList) {
        this.languageList = languageList;
    }
}
