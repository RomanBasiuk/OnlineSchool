import com.online_school.classes.Courses;
import com.online_school.classes.Lectures;
import com.online_school.classes.Students;

public class Main {

    public static void main(String[] args) {

        Lectures lecturesName = new Lectures(1L, "nameLecture");
        Lectures lecturesName2 = new Lectures(1L, "nameLecture");
        Lectures lecturesName3 = new Lectures(1L, "nameLecture");

        Lectures LecturesName3 = new Lectures(2L, "ameLecture2");
        Lectures LecturesName4 = new Lectures(2L, "ameLecture2");


        lecturesName.printNameLectures();
        lecturesName.printNameLectures();
        lecturesName.printNameLectures();

        lecturesName.printNameLectures();
        lecturesName.printNameLectures();


        System.out.println();

        Courses courses = new Courses(1L,"Lecture","Teacher");
        Courses courses2 = new Courses(1L,"Lecture", "Teacher");
        Courses courses3 = new Courses(1L,"Lecture","Teacher");

        courses.printNameCourses();
        courses2.printNameCourses();
        courses3.printNameCourses();

        System.out.println();

    /* Students studentWithName = new Students("Name","Surname");
        Students studentWithName2 = new Students("Name2","Surname2");
        Students studentWithName3 = new Students("Name3","Surname3");

        studentWithName.printNameStudents ();
        studentWithName2.printNameStudents ();
        studentWithName3.printNameStudents (); */


    }
}