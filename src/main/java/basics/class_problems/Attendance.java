package src.main.java.basics.class_problems;
class AttendanceSheet {
    private final String[] students;
    private int count;

    public AttendanceSheet(int capacity) {
        students = new String[capacity];
        count = 0;
    }

    public void markPresent(String name) {
        if (isPresent(name)) {
            return;
        }

        if (count < students.length) {
            students[count] = name;
            count++;
        } else {
            System.out.println("Attendance sheet is full");
        }
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return true;
            }
        }

        return false;
    }
}

public class Attendance{
    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println(sheet.getPresentCount());
        System.out.println(sheet.isPresent("Ben"));
        System.out.println(sheet.isPresent("Chen"));
    }
}
