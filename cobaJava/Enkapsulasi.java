class Tabungan{
    private double saldo;
    public Tabungan(double saldoAwal){
        this.saldo = saldoAwal;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setorUang(double jumlah){
        if(jumlah>0){
            saldo+= jumlah;
            System.out.println("Berhasil setor "+ jumlah);
        } else{
            System.out.println("Jumlah Setor Harus Positif!");
        }
    }
    public void tarikUang(double jumlah){
        if(jumlah > 0 && jumlah <= saldo){
            saldo -= jumlah;
            System.out.println("Berhasil di tarik sebesar "+ jumlah);
        }else{
            System.out.println("Saldo Tidak mencukupi");
        }
    }
}

public class Enkapsulasi {
    public static void main(String[] args) {
        Tabungan atmHaidar = new Tabungan(5000000);
        atmHaidar.setorUang(2500000);
        atmHaidar.tarikUang(1000000);
        System.out.println(atmHaidar.getSaldo());
    }
}
