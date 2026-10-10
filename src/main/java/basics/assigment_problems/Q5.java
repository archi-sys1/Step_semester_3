package src.main.java.basics.assigment_problems;

import java.util.*;
import java.time.LocalDate;

abstract class Plan {
    String name;
    LocalDate startDate;

    Plan(String name, String startDate) {
        this.name = name;
        this.startDate = LocalDate.parse(startDate);
    }

    abstract int getValidityDays();

    LocalDate getRenewalDate() {
        return startDate.plusDays(getValidityDays());
    }
}

class Basic extends Plan {
    Basic(String name, String date) {
        super(name, date);
    }

    int getValidityDays() {
        return 30;
    }
}

class Standard extends Plan {
    Standard(String name, String date) {
        super(name, date);
    }

    int getValidityDays() {
        return 90;
    }
}

class Premium extends Plan {
    Premium(String name, String date) {
        super(name, date);
    }

    int getValidityDays() {
        return 365;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            String date = sc.next();

            Plan p;

            switch (type) {
                case "BASIC":
                    p = new Basic(name, date);
                    break;
                case "STANDARD":
                    p = new Standard(name, date);
                    break;
                default:
                    p = new Premium(name, date);
            }

            System.out.println(name + ": " +
                    p.getRenewalDate());
        }

        sc.close();
    }
}
