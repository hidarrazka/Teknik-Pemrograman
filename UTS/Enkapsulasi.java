package UTS;
class BankAccount{
    // private
    private double balance;
    private String ownerName;

    public BankAccount(String nama, double deposit){
        this.ownerName = nama;
        this.balance = deposit;
    }
    //getter
    public double getBalance(){
        return balance;
    }
    //setter
    public void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
            System.out.println("deposit sebesar " + balance);
        } else{
            System.out.println("lu miskin pruy");
        }
    }
}
public class Enkapsulasi {
    public static void main(String[] args) {
        BankAccount orkay = new BankAccount("Haidar Azka", 100000);
        orkay.deposit(500);
        System.out.println("uang saya sebesar " + orkay.getBalance());
    }
}
