public class TiketBioskop {
    private String[] nama_film;
    private double[] durasi;
    private String[] genre;
    private Integer[] tanggal;
    private Integer[] jam;
    private Integer[] stok;
    private double[] harga;
    private static byte id = 0; // Menunjuk ke index array yang sedang aktif

    public TiketBioskop() {
        // Inisialisasi semua array agar tidak NullPointerException
        nama_film = new String[10];
        durasi = new double[10];
        genre = new String[10];
        tanggal = new Integer[10];
        jam = new Integer[10];
        stok = new Integer[10]; // Tadi ini lupa diinisialisasi
        harga = new double[10];
    }

    public void tambahFilm(String nama, double durasi, String genre, Integer tanggal, Integer jam, Integer stok, double harga) {
        if (id < 10) {
            this.nama_film[id] = nama;
            this.durasi[id] = durasi;
            this.genre[id] = genre;
            this.tanggal[id] = tanggal;
            this.jam[id] = jam;
            this.stok[id] = stok;
            this.harga[id] = harga;
            nextId(); // Otomatis naikkan ID setelah tambah film
        } else {
            System.out.println("Kapasitas film penuh!");
        }
    }

    public void tampilMenuFilm() {
        System.out.println("--- Daftar Film Tersedia ---");
        // Gunakan i < id agar hanya menampilkan data yang sudah diisi
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(i + ". " + nama_film[i] + " | " + genre[i] + " | Jam: " + jam[i] + " | Stok: " + stok[i]);
            }
        }
    }

    public boolean isOutOfStock(int index) {
        // Pastikan stok tidak null sebelum dicek
        return stok[index] == null || stok[index] <= 0;
    }

    public void pesan(String nama, int jumlah, double uang, Integer tanggals, Integer jams) {
        for (int i = 0; i < id; i++) {
            if (nama_film[i].equalsIgnoreCase(nama) && tanggal[i].equals(tanggals) && jam[i].equals(jams)) {
                if (stok[i] >= jumlah) {
                    double totalHarga = harga[i] * jumlah;
                    
                    // Tambahan validasi uang
                    if (uang >= totalHarga) {
                        stok[i] -= jumlah;
                        System.out.println("Pesanan " + nama + " sebanyak " + jumlah + " berhasil.");
                        System.out.println("Kembalian: " + (uang - totalHarga));
                    } else {
                        System.out.println("Uang tidak cukup. Kurang: " + (totalHarga - uang));
                    }
                } else {
                    System.out.println("Stok tidak mencukupi. Sisa: " + stok[i]);
                }
                return;
            }
        }
        System.out.println("Film " + nama + " tidak ditemukan untuk jadwal tersebut.");
    }

    public static void nextId() {
        id++;
    }
}