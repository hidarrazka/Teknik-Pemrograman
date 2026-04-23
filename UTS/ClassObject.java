package UTS;

class Mahasiswa{
    private String nim;
    private String nama;
    private double nilaiUTS;
    private double nilaiUAS;
    public Mahasiswa(String nim, String nama, double nilaiUTS, double nilaiUAS){
        this.nim = nim;
        this.nama = nama;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public double hitungNilaiAkhir(){
        return(nilaiUTS * 0.4) + (nilaiUAS * 0.6);
    }
    public void tampilkan(){
        System.out.println("NIM " + nim + " Nama " + nama + " nilaiUTS " + nilaiUTS + " nilaiUAS " + nilaiUAS);
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Mahasiswa  m1 = new Mahasiswa("050", "Haidar", 90, 80);
        m1.tampilkan(); 
    }
    
}
