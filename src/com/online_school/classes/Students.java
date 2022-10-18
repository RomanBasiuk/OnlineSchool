package com.online_school.classes;

public class Students {
    private Long ID;
    private String name;
    private String surname;

    public static int student;
    public Students(String name, String surname) {
        this.name = name;
        this.surname = surname;
        student++;
    }

    public void printNameStudents () {

        System.out.println(name + " " + surname);
        }


}
