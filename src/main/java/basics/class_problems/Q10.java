package src.main.java.basics.class_problems;
import java.util.*;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;

        for (int mark : marks)
            sum += mark;

        return sum / 3.0;
    }

    char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90)
            return 'A';
        else if (avg >= 75)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else if (avg >= 40)
            return 'D';
        else
            return 'F';
    }

    void display() {
        System.out.printf("%s: Average %.1f, Grade %c%n",
                name.toUpperCase(),
                calculateAverage(),
                calculateGrade());
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();

            if (line.isEmpty())
                continue;

            String name = line.substring(0, line.indexOf('[')).trim();
            String numbers = line.substring(
                    line.indexOf('[') + 1,
                    line.indexOf(']'));

            String[] values = numbers.split(",");
            int[] marks = new int[3];

            for (int i = 0; i < 3; i++)
                marks[i] = Integer.parseInt(values[i].trim());

            Student s = new Student(name, marks);
            s.display();
        }

        sc.close();
    }
}