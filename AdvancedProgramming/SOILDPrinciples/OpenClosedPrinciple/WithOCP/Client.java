package AdvancedProgramming.SOILDPrinciples.OpenClosedPrinciple.WithOCP;

import java.util.List;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

    }

    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudent("Sam", "R1", 81.5, "Comp.Sc.");
        Student bob = new ScienceStudent("bob", "R2", 72, "Physics.");

        List<Student> scienceStudents = new ArrayList<Student>();
        scienceStudents.add(bob);
        scienceStudents.add(sam);
        return scienceStudents;
    }

    private static List<Student> enrollArtsStudents() {
        Student john = new ArtsStudent("John", "R3", 71, "History");
        Student kate = new ArtsStudent("Kate", "R4", 66.5, "English");

        List<Student> arStudents = new ArrayList<Student>();
        return arStudents;
    }
}
