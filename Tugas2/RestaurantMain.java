package Tugas2;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
    
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
        int pilihan;
        do{
            System.out.println("1. Memesan Menu");
            System.out.println("2. Menu Makanan");
            System.out.println("3. Keluar");
            System.out.println("Pilihan");
            pilihan = inputUser.nextInt();
            
            switch (pilihan) {
                case 1:
                    inputUser.nextLine();
                    System.out.println("Memesan Makanan Apa: ");
                    String namaMakan = inputUser.nextLine();
                    System.out.println("Memesan Berapa Stok");
                    int memesan = inputUser.nextInt();
                    menu.pesan(namaMakan,memesan);
                    menu.tampilMenuMakanan();
                    break;
                case 2:
                    System.out.println("Daftar Menu");
                    menu.tampilMenuMakanan();
                    break;
                case 3:
                    System.out.println("Terima Kasih! ");
                default:
                    System.out.println("Pilihan Tidak Tepat");
                    break;
            }
        } while (pilihan != 3);
    }
}
