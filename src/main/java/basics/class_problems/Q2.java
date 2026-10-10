package src.main.java.basics.class_problems;

import java.util.*;
import java.time.*;
import java.util.regex.*;

abstract class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract int getDays();

    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26)
                .plusDays(getDays());
    }
}

class Book extends LibraryItem {
    Book(String title) {
        super(title);
    }

    int getDays() {
        return 14;
    }
}

class DVD extends LibraryItem {
    DVD(String title) {
        super(title);
    }

    int getDays() {
        return 7;
    }
}

class Magazine extends LibraryItem {
    Magazine(String title) {
        super(title);
    }

    int getDays() {
        return 3;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String type = line.substring(0, line.indexOf(' '));
            Matcher m = Pattern.compile("\"([^\"]*)\"").matcher(line);

            String title;
            if (m.find()) {
                title = m.group(1);
            } else {
                title = line.substring(type.length()).trim();
            }

            LibraryItem item;

            switch (type) {
                case "BOOK":
                    item = new Book(title);
                    break;
                case "DVD":
                    item = new DVD(title);
                    break;
                default:
                    item = new Magazine(title);
            }

            System.out.println(item.title + ": " +
                    item.getDueDate());
        }

        sc.close();
    }
}
