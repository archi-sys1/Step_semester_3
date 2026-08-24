package Step_semester_3.src.main.java.basics.class_problems;
class Type {
    static void check(String a, String b) {
        int count = 0, first = -1;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i))
                count++;
            else if (first == -1)
                first = i;
        }

        double acc = count * 100.0 / a.length();

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%\n",
                count, a.length(), acc);

        if (first == -1)
            System.out.println("No Mismatches");
        else
            System.out.println("First Mismatch: " + (first + 1));
    }

    public static void main(String[] args) {
        check("hello world", "hello worlt");
    }
}