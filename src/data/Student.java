package data;

import service.DataService;

import java.util.List;

public abstract class Student extends User{
    private int groupNumber;

    public Student(String name, int age, int passport, int groupNumber) {
        super(name, age, passport);
        this.groupNumber = groupNumber;
    }


}

