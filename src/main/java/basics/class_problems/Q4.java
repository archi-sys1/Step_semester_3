package src.main.java.basics.class_problems;

import java.util.*;
import java.util.regex.*;

abstract class Question {
    String question, correct, answer;
    double points;

    Question(String q, String c, String a, double p) {
        question = q;
        correct = c;
        answer = a;
        points = p;
    }

    abstract double grade();
    abstract String getType();
}

class MCQ extends Question {
    MCQ(String q, String c, String a, double p) {
        super(q, c, a, p);
    }

    double grade() {
        return answer.equals(correct) ? points : 0;
    }

    String getType() {
        return "MCQ";
    }
}

class TF extends Question {
    TF(String q, String c, String a, double p) {
        super(q, c, a, p);
    }

    double grade() {
        return answer.equals(correct) ? points : 0;
    }

    String getType() {
        return "TF";
    }
}

class Essay extends Question {
    Essay(String q, String c, String a, double p) {
        super(q, c, a, p);
    }

    double grade() {
        int matched = 0;

        for (String keyword : correct.split(",")) {
            if (answer.toLowerCase().contains(
                    keyword.trim().toLowerCase())) {
                matched++;
            }
        }

        if (matched >= 2)
            return points * 0.75;
        else if (matched == 1)
            return points * 0.50;
        else
            return 0;
    }

    String getType() {
        return "ESSAY";
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;

        Pattern pattern = Pattern.compile("\"([^\"]*)\"");

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String type = line.substring(0, line.indexOf(' '));

            Matcher m = pattern.matcher(line);
            String[] values = new String[3];

            for (int j = 0; j < 3; j++) {
                m.find();
                values[j] = m.group(1);
            }

            double points = Double.parseDouble(
                    line.substring(line.lastIndexOf('"') + 1).trim());

            Question q;

            switch (type) {
                case "MCQ":
                    q = new MCQ(values[0], values[1],
                            values[2], points);
                    break;
                case "TF":
                    q = new TF(values[0], values[1],
                            values[2], points);
                    break;
                default:
                    q = new Essay(values[0], values[1],
                            values[2], points);
            }

            double score = q.grade();
            total += score;

            System.out.printf("%s: %.2f%n",
                    q.getType(), score);
        }

        System.out.printf("Total Score: %.2f%n", total);
        sc.close();
    }
}
