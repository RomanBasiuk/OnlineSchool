package com.online_school.classes;

public class Courses {
    private Long ID;
    private String nameLecture;
    private String nameTeacher;

    public Courses(){

    }

    public Courses(Long ID, String nameLectures, String nameTeacher){
    this.ID = ID;
    this.nameLecture = nameLectures;
    this.nameTeacher = nameTeacher;
    }

    public void printNameCourses() {

        System.out.println(ID + " " + nameLecture + " " + nameTeacher + "");
    }

}
