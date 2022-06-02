package com.compan;

import java.util.InputMismatchException;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        try {
            if (age < 0) {
                throw new MyException(" -san berbeniz");
            }
            if (!name.matches("^[A-Za-z0-9]*$")) {
                throw new MyException("white your name in English");
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException r) {
            System.out.println("vhjmjk,h");
        }
        if (age < 0) {

        } else {
            this.age = age;
        }
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}