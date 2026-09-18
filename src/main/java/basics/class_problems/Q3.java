package Step_semester_3.src.main.java.basics.class_problems;
class Course{
    String code;
    String title;
    int credits;
    int labCredits;
    Course(String code, String title, int credits, int labCredits){
        this.code=code;
        this.title=title;
        this.credits=credits;
        this.labCredits=labCredits;
    }
    Course(String code, String title, int credits){
        this.code=code;
        this.title=title;
        this.credits=credits;
        labCredits=0;
    }
    void totalCredits(){
        System.out.println(code+ " total credits: " + (credits+labCredits));
    }
}
public class Q3 {
    public static void main(String[] args) {
        Course c1= new Course("21CSC201J","Data Structures",4);
        Course c2= new Course("21CSC205L","DSA Lab",3,1);
        c1.totalCredits();
        c2.totalCredits();
    }

}
