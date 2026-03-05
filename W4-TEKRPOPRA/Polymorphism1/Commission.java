public class Commission extends Hourly 
{
    private double totalSales;
    private double comissionRate;
    public Commission(String eName, String eAddress, String ePhone,String socSecNumber, double rate, double comissionRate){
        super(eName, eAddress, ePhone, socSecNumber,rate);
        this.comissionRate = rate;
        
    }
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }
    public double pay() {
        double basePay = super.pay() + (totalSales * comissionRate);
        totalSales = 0;
        return basePay;
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nTotal Sales: " + totalSales +
               "\nCommission Rate: " + comissionRate;
    }
}
