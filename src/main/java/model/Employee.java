package model;


import aspect.Loggable;

public class Employee {

    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void throwsException(){
        throw new RuntimeException("Dummy Exception");
    }

}
