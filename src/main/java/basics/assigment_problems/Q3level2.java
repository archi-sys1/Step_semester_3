package Step_semester_3.src.main.java.basics.assigment_problems;
public class Q3level2 {
    static void printSkippingMultiplesOfThree(){
        for(int i=1; i<=20;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printSkippingMultiplesOfThree();
    }

}
