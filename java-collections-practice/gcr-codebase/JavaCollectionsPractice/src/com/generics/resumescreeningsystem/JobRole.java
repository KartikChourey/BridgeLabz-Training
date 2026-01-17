package com.generics.resumescreeningsystem;

abstract class JobRole {
    abstract String getRole();
}

class SoftwareEngineer extends JobRole {
    public String getRole() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    public String getRole() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    public String getRole() {
        return "Product Manager";
    }
}