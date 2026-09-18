package Step_semester_3.src.main.java.basics.class_problems;
class PlacementRecord{
    String studentName;
    String company;
    double packageLpa;
    PlacementRecord(String studentName, String company,double packageLpa){
        this.studentName=studentName;
        this.company=company;
        this.packageLpa=packageLpa;
    }
    void printRecord(){
        System.out.println(studentName+" -> " + company +" @ "+ packageLpa+" LPA.");
    }

}
public class Q1 {
    public static void main(String[] args) {
        PlacementRecord r1= new PlacementRecord("Ravi", "TCS", 4.5);
        PlacementRecord r2= new PlacementRecord("Anitha", "Zoho", 6.2);
        PlacementRecord r3= new PlacementRecord("Karthik", "Infosys", 4.0);
        PlacementRecord[] records= new PlacementRecord[3];
        records[0]=r1;
        records[1]=r2;
        records[2]=r3;
        for(int i=0;i<records.length;i++){
            records[i].printRecord(); 
        }
    }
    
}