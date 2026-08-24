package Step_semester_3.src.main.java.basics.class_problems;
class Signal {
    static void check(String s) {
        int count = 1, max = 1;
        char c = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                count++;
            else
                count = 1;

            if (count > max) {
                max = count;
                c = s.charAt(i);
            }
        }

        System.out.println(c + " repeated " + max + " times");
    }

    public static void main(String[] args) {
        check("RRGGGYRR");
    }
}