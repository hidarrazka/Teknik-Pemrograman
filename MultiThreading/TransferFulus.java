class Account {
    int balance = 150;
}

public class TransferFulus {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account();
        Account acc2 = new Account();

        // Thread 1: Menjumlahkan/ transfer fulus dari acc1 ke acc2
        Thread t1 = new Thread(() -> {
            synchronized (acc1) { // Mengunci objek acc1 (Monitor Lock) agar tidak diakses thread lain secara bersamaan.
                System.out.println("Berikan pesan yang di cetak sebagai penanda thread ini sedang melakukan apa?");
                /* Exception (InterruptedException) diperlukan karena Thread.sleep() adalah 'checked exception'.
                    Ini digunakan untuk menangani situasi jika thread yang sedang tidur dihentikan paksa
                    oleh thread lain (interupsi). */
                try { Thread.sleep(100); } catch (InterruptedException e) {e.printStackTrace();} 

                synchronized (acc2) { // Mengunci objek acc2 (Nested Lock) untuk melakukan transaksi antar dua akun
                    System.out.println("Berikan pesan yang di cetak sebagai penanda thread ini sedang melakukan apa?");
                    acc2.balance += acc1.balance;
                }
            }
        });

        // Thread 2: Menjumlahkan/ transfer fulus dari acc2 ke acc1
        Thread t2 = new Thread(() -> {
            synchronized (acc1) { /* Solusi Deadlock: mengunci acc1 terlebih dahulu (sama seperti Thread 1).
             * Dengan urutan penguncian yang sama, Thread 2 tidak akan memegang acc2 sambil menunggu acc1.*/
                System.out.println("Berikan pesan yang di cetak sebagai penanda thread ini sedang melakukan apa?");
                try { Thread.sleep(100); } catch (InterruptedException e) {e.printStackTrace();}

                synchronized (acc2) { // Mengunci objek acc2 setelah acc1 berhasil dikunci
                    System.out.println("Berikan pesan yang di cetak sebagai penanda thread ini sedang melakukan apa?");
                    acc1.balance += acc2.balance;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Saldo Akhir acc1: " + acc1.balance);
		System.out.println("Saldo Akhir acc2: " + acc2.balance);
    }
}
