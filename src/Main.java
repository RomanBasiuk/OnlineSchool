import com.online_school.classes.Students;

public class Main {

    public static void main(String[] args) {

        Students studentWithName = new Students("Name","Surname");
        Students studentWithName2 = new Students("Name2","Surname2");
        Students studentWithName3 = new Students("Name3","Surname3");

        studentWithName.printNameStudents ();
        studentWithName2.printNameStudents ();
        studentWithName3.printNameStudents ();


    }
}