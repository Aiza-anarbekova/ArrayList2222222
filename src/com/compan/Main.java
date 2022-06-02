package com.compan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("Datka", 21));
            students.add(new Student("Aiza", 21));
            students.add(new Student("жаулан", 22));
            students.add(new Student("Guljan", -24));
            students.add(new Student(null, 21));


            for (Student st : students) {
                if (st.getAge()!=0 && st.getName()!=null) {
                    System.out.println(st.getName()+st.getAge());
                }

            }
          //  System.out.println(students.get(6));
        } catch (IndexOutOfBoundsException e){
            System.out.println("takogo indexa netu");
        }
    }
}