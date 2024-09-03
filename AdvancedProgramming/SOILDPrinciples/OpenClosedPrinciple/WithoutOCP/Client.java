package AdvancedProgramming.SOILDPrinciples.OpenClosedPrinciple.WithoutOCP;

import java.util.List;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** A demo without OCP.***");
        List<Student> enrolledStudents = enrollStudents();

        System.out.println("===Results:===");
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }

        System.out.println("===Distinctions:===");

        DistinctionDecider distinctionDecider = new DistinctionDecider();

        for (Student student : enrolledStudents) {
            distinctionDecider.evaluateDistinction(student);
        }

    }

    private static List<Student> enrollStudents() {
        Student sam = new Student("Sam", "R1", "Com.Sc", 81.5);
        Student bob = new Student("Bob", "R2", "Physics", 72);
        Student john = new Student("John", "R3", "History", 71.5);
        Student kate = new Student("Kate", "R4", "English", 66);

        List<Student> Students = new ArrayList<Student>();
        Students.add(kate);
        Students.add(bob);
        Students.add(john);
        Students.add(sam);
        return Students;
    }
}
