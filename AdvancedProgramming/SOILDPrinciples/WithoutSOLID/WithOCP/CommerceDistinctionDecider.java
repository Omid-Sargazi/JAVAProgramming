package AdvancedProgramming.SOILDPrinciples.WithoutSOLID.WithOCP;

public class CommerceDistinctionDecider implements DistinctionDecider {
    @Override
    public void evaluateDistinction(Student student) {
        if (student.score > 56) {
            System.out.println(student.regNumber + " has received a distinction in commerce.");
        }
    }
}
