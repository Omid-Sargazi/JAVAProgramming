package AdvancedProgramming.SOILDPrinciples.SingleResponsibility.WithSRP;

public class SeniorityChecker {
    public String checkSeniority(double experienceInYears) {
        return experienceInYears > 5 ? "Senior" : "Junior";
    }
}
