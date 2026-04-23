package UTS;
// Class Mesin
class Mesin {
    private String tipe;
    private int tenagaKuda;
    
    public Mesin(String tipe, int tenagaKuda) {
        this.tipe = tipe;
        this.tenagaKuda = tenagaKuda;
    }
    
    public void hidupkan() {
        System.out.println("Mesin " + tipe + " dinyalakan");
    }
    
    public String getTipe() {
        return tipe;
    }
}

// Class Mobil (memiliki Aggregation dengan Mesin)
class Mobil {
    private String merk;
    private String warna;
    private Mesin mesin;  // Aggregation: Mobil memiliki Mesin
    
    public Mobil(String merk, String warna, Mesin mesin) {
        this.merk = merk;
        this.warna = warna;
        this.mesin = mesin;  // Mesin dibuat di luar dan dimasukkan
    }
    
    public void start() {
        System.out.print("Mobil " + merk + " " + warna + " - ");
        mesin.hidupkan();
    }
}

// Main class
public class DemoAggregation {
    public static void main(String[] args) {
        // Mesin dibuat secara independen
        Mesin mesinV8 = new Mesin("V8", 450);
        Mesin mesinElectric = new Mesin("Electric", 200);
        
        // Mobil menggunakan mesin yang sudah ada
        Mobil mobil1 = new Mobil("Toyota", "Merah", mesinV8);
        Mobil mobil2 = new Mobil("Tesla", "Putih", mesinElectric);
        
        mobil1.start();  // Output: Mobil Toyota Merah - Mesin V8 dinyalakan
        mobil2.start();  // Output: Mobil Tesla Putih - Mesin Electric dinyalakan
        
        // Mesin bisa digunakan oleh mobil lain
        Mobil mobil3 = new Mobil("Lexus", "Hitam", mesinV8);
        mobil3.start();  // Mesin V8 digunakan lagi
    }
}