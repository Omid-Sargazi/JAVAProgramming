package AdvancedProgramming.SOILDPrinciples.WithoutSOLID.WithOCP;

public class Student {
    String name;
    String regNumber;
    double score;
    String department;

    public Student(String name, String regNumber, double score) {
        this.name = name;
        this.score = score;
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", regNumber=" + regNumber + ", score=" + score + ", department=" + department
                + "]";
    }

}
