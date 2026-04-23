import java.util.Scanner;

public class TiketBioskopMain {
public static void main(String[] args) {
        // 1. Inisialisasi Objek TiketBioskop
        TiketBioskop bioskop = new TiketBioskop();
        Scanner input = new Scanner(System.in);

        // 2. Menambahkan Data Film (Menggunakan method tambahFilm yang sudah diperbaiki)
        // Format: Nama, Durasi, Genre, Tanggal, Jam, Stok, Harga
        bioskop.tambahFilm("Avengers", 2.5, "Action", 12, 1400, 50, 50000);
        bioskop.tambahFilm("Spiderman", 2.0, "Action", 12, 1700, 30, 45000);
        bioskop.tambahFilm("Frozen 2", 1.5, "Animation", 13, 1000, 10, 35000);

        // 3. Menampilkan Menu Film
        bioskop.tampilMenuFilm();

        System.out.println("\n--- Simulasi Pemesanan ---");
        
        // 4. Input Pesanan dari Pengguna
        System.out.print("Masukkan Nama Film: ");
        String namaFilm = input.nextLine();

        System.out.print("Masukkan Tanggal: ");
        int tgl = input.nextInt();

        System.out.print("Masukkan Jam: ");
        int jam = input.nextInt();

        System.out.print("Jumlah Tiket: ");
        int jml = input.nextInt();

        System.out.print("Masukkan Uang Pembayaran: ");
        double bayar = input.nextDouble();

        // 5. Proses Pemesanan
        bioskop.pesan(namaFilm, jml, bayar, tgl, jam);

        // 6. Cek sisa stok setelah dipesan
        System.out.println("\n--- Update Menu Setelah Pemesanan ---");
        bioskop.tampilMenuFilm();

        input.close();
    }    
}
