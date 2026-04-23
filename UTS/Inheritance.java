package UTS;
class Hero{
    String nama;
    double gaji;
    void namaOrang(String nama){
        this.nama = nama;
    }
    void display(){
        System.out.println("Nama orang " + nama ); 
    }
    public double upah(){
        return gaji;
    }

}
class HeroStreng extends Hero{
    Integer power;
    void kekuatan(Integer power, double money){
        this.power = power;
        this.gaji = money;
    }
    public double upah(){
        return gaji * 2;
    }
    @Override
    void display(){
        System.out.println("Nama orang " + nama + " dengan kekuatan " + power + "dengan gaji " + super.upah());
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.namaOrang("Eko");
        hero1.display();
        HeroStreng hero2 = new HeroStreng();
        hero2.namaOrang("Ganteng");
        hero2.kekuatan(100, 100000);
        hero2.display();
    }
}
