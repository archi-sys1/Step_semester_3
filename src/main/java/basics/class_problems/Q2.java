package Step_semester_3.src.main.java.basics.class_problems;
class MessWallet{
    private double balance;
    MessWallet(double balance){
        if(balance<0){
            this.balance=0;
            System.out.println("Error no negative value allowed! Balance set to 0....");
        }
        else{
            this.balance=balance;
        } 
    }
    public void topup(double amount){
        if(amount<=0){
            System.out.println("Negative or 0 top up not allowed. Balance is: " + balance);
        }
        else{
            balance += amount;
            System.out.println("Balance after top-up: "+ balance);
        }
    }
    public void deduct(double amount){
        if(amount>balance){
            System.out.println("Deduct rejected: insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println("Balance after Deduct: "+ balance);
        }
    }
    public void getBalance(){
        System.out.println("Final balance: " + balance);
    }
}
public class Q2 {
    public static void main(String[] args) {
        MessWallet m1=new MessWallet(500);
        m1.topup(200);
        m1.deduct(1000);
        m1.getBalance();
    }

}

