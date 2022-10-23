import com.online_school.classes.Courses;
import com.online_school.classes.Lectures;
import com.online_school.classes.Students;

public class Main {

    public static void main(String[] args) {

        Lectures lecturesName = new Lectures("Name Lecture");
        Lectures lecturesName2 = new Lectures("Name Lecture 2");
        Lectures lecturesName3 = new Lectures("Name Lecture 3");

        lecturesName.printNameLectures();
        lecturesName2.printNameLectures();
        lecturesName3.printNameLectures();

        System.out.println();

        Courses courses = new Courses(1L,"1 Lecture","1 Teacher");
        Courses courses1 = new Courses(2L,"2 Lecture", "2 Teacher");
        Courses courses2 = new Courses(3L,"3 Lecture","3 Teacher");

        courses.printNameCourses();
        courses1.printNameCourses();
        courses2.printNameCourses();

        System.out.println();

        Students studentWithName = new Students("Name","Surname");
        Students studentWithName2 = new Students("Name2","Surname2");
        Students studentWithName3 = new Students("Name3","Surname3");

        studentWithName.printNameStudents ();
        studentWithName2.printNameStudents ();
        studentWithName3.printNameStudents ();


    }
}