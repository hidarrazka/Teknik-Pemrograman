package UTS;
interface Payment{
    void processPayment(double amount);
    default void printReceipt(double amount){
        System.out.println("Receipt: " + amount);
    }
    static void info(){
        System.out.println("Metode pembayaran tersedia");
    }
}
class CreditCardPayment implements Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("Pembayaran dengan kartu kredit " + amount);
    }
}
public class Interface {
    public static void main(String[] args) {
        CreditCardPayment c1 = new CreditCardPayment();
        c1.processPayment(50000);
    }
}
