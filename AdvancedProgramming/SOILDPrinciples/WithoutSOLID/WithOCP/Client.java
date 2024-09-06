package AdvancedProgramming.SOILDPrinciples.WithoutSOLID.WithOCP;

import java.util.List;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** A demo without OCP. ***");

        List<Student> enrolledStudent = enrollScienceStudents();
        // Display all results.
    }

    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudent("Sam", "R1", 81.5, "Comp.Sc.");
        Student bob = new ScienceStudent("Bob", "R2", 72, "Physics");
        List<Student> scienceStudents = new ArrayList<Student>();
        scienceStudents.add(sam);
        scienceStudents.add(bob);
        return scienceStudents;
    }

    private static List<Student> enrollArtsStudents() {
        Student john = new ArtsStudent("John", "R3", 71, "History");
        Student kate = new ArtsStudent("Kate", "R4", 66.5, "English");
        List<Student> artsStudents = new ArrayList<Student>();
        artsStudents.add(john);
        artsStudents.add(kate);
        return artsStudents;
    }
}
