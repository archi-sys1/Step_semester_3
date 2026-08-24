package Step_semester_3.src.main.java.basics.class_problems;
class Movie {
    static void check(String s) {
        String[] w = s.split(" ");
        int sh = 0, me = 0, lo = 0;

        for (String x : w) {
            if (x.length() <= 4)
                sh++;
            else if (x.length() <= 8)
                me++;
            else
                lo++;
        }

        System.out.println("Short: " + sh +
                " | Medium: " + me + " | Long: " + lo);
    }

    public static void main(String[] args) {
        check("This movie was absolutely fantastic and thrilling");
    }