package Tugas2;
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id + 1; i++) {   // diperbaiki
            if (!isOutOfStock(i)) {
                System.out.println(
                    nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]
                );
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if(stok[id] == 0){
            return true;
        } else{
            return false;
        }
    }
     public void pesan(String nama, int jumlah) {
        for (int i = 0; i < id + 1; i++) {
            if (nama_makanan[i].equalsIgnoreCase(nama)) {
                if (stok[i] >= jumlah) {
                    stok[i] -= jumlah;
                    double totalHarga = harga_makanan[i] * jumlah;
                    System.out.println("Pesanan " + nama + " sebanyak " + jumlah + " berhasil dengan total harga " + totalHarga);
                } else {
                    System.out.println("Stok " + nama + " tidak mencukupi. Sisa stok: " + stok[i]);
                }
                return;
            }
        }
        System.out.println("Makanan " + nama + " tidak ditemukan.");
    }

    public static void nextId() {
        id++;
    }
}
