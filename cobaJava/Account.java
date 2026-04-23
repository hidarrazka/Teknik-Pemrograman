public class Account{
    private double balance;
    public void deposit(double amount){
        if(amount >0){
            balance+=amount;
        }
    }
    public double getBalance(){
            return balance;
    }
    public static void main(String[] args) {
        Account punyaHaidar = new Account();
        punyaHaidar.deposit(4);
        System.out.println(punyaHaidar.getBalance());

    }
 }

