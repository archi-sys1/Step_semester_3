package Step_semester_3.src.main.java.basics.class_problems;
import java.util.Arrays;

class Candidate implements Comparable<Candidate> {
    private String name;
    private double cgpa;
    private int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    double getCompositeScore() {
        return cgpa * 10 + codingScore;
    }

    String getName() {
        return name;
    }

    public int compareTo(Candidate other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());
    }

    static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] shortlisted = new Candidate[candidates.length];
        int count = 0;

        for (Candidate candidate : candidates) {
            if (isEligible(candidate.cgpa) ||
                isEligible(candidate.cgpa, candidate.codingScore)) {
                shortlisted[count++] = candidate;
            }
        }

        Candidate[] result = Arrays.copyOf(shortlisted, count);
        Arrays.sort(result);

        String output = "";

        for (int i = 0; i < result.length; i++) {
            output += (i + 1) + ". " +
                      result[i].getName() + " (" +
                      result[i].getCompositeScore() + ")";

            if (i < result.length - 1) {
                output += " | ";
            }
        }

        return output;
    }
}

public class Q5{
    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aria", 9.7, 80),
            new Candidate("Ronish", 9.8, 65),
            new Candidate("Himanshu", 6.0, 90),
            new Candidate("Kartik", 4.5, 20)
        };

        System.out.println(Candidate.shortlistAndRank(candidates));
    }
}
