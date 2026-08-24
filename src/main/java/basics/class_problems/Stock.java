package Step_semester_3.src.main.java.basics.class_problems;
class Stock {
    static void check(int[] a, int[] b) {
        int x = 0, y = 0, max = a[0], index = 0;
        char section = 'A';

        for (int i = 0; i < a.length; i++) {
            x += a[i];
            y += b[i];

            if (a[i] > max) {
                max = a[i];
                index = i;
                section = 'A';
            }

            if (b[i] > max) {
                max = b[i];
                index = i;
                section = 'B';
            }
        }

        System.out.println(x == y ? "Balanced" : "Not Balanced");
        System.out.println("Highest: " + max +
                " (Section " + section + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {
        int[] a = {20, 15, 30};
        int[] b = {25, 10, 30};
        check(a, b);
    }
}