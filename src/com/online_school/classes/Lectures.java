package com.online_school.classes;

public class Lectures {
    private Long ID;

    private String nameLecture;

    public static int Lecture = 0;

    public Lectures(){

    }

    public Lectures(Long ID, String nameLecture){
        this.ID = ID;
        this.nameLecture = nameLecture;

    }

    public void printNameLectures () {
        Lecture++;
        System.out.println(Lecture + " " + ID + " " + nameLecture + " ");
    }


}
