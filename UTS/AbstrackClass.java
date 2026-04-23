package UTS;

abstract class Kendaraan{
    protected String merk;
    protected int tahun;
    Kendaraan(String merk, int tahun){
        this.merk = merk;
        this.tahun = tahun;
    }
    public void infoKendaraan(){
        System.out.println("Merk : " + merk);
        System.out.println("Tahun : " + tahun);
    }
    public abstract void nyalakanMesin();
    public abstract void matikanMesin();
}

class Mobil extends Kendaraan{
    private int jumlahPintu;
    public Mobil(String merk, int tahun, int jumlahPintu){
        super(merk,tahun);
        this.jumlahPintu = jumlahPintu;
    }
    @Override
    public void nyalakanMesin(){
        System.out.println("Mesin mobil dinyalakan dengan kunci   atau tombol start");
    }
    @Override
    public void matikanMesin(){
        System.out.println("Mesin mobil sudah dimatikan");
    }

}

public class AbstrackClass {
    public static void main(String[] args) {
        Mobil k1 = new Mobil("Suzuki", 2018,4);
        k1.infoKendaraan();
    }


}
