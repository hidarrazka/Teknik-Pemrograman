import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class PenjumlahanParalel{
    private static final AtomicLong totalAkhir = new AtomicLong();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Thread: ");
        int jmlhThread = input.nextInt();
        System.out.println("Masukkan Angka Akhir: ");
        long angkaAkhir = input.nextLong();
        long rangePerThread = angkaAkhir/jmlhThread;
        long sisa = angkaAkhir % jmlhThread;
        long start = 1;
        ExecutorService eksekutor = Executors.newFixedThreadPool(jmlhThread);
        for (int i = 1; i <= jmlhThread; i++) {
            long end = start + rangePerThread - 1;
            
            // Jika ini thread terakhir, ambil sisa pembagiannya
            if (i == jmlhThread) {
                end += sisa;
            }

            // Variabel yang digunakan di dalam lambda/anonymous class harus final
            final long fStart = start;
            final long fEnd = end;
            final int id = i;

            // Masukkan tugas ke eksekutor
            eksekutor.submit(() -> {
                long hasilParsial = 0;
                for (long j = fStart; j <= fEnd; j++) {
                    hasilParsial += j;
                }
                
                // Menampilkan hasil sesuai permintaan soal
                System.out.println("Thread " + id + " mengerjakan: " + fStart + "-" + fEnd);
                System.out.println("Thread " + id + " Hasil Parsial: " + hasilParsial);
                
                // Update total akhir secara aman (Synchronization)
                totalAkhir.addAndGet(hasilParsial);
            });

            // Geser start untuk thread berikutnya
            start = end + 1;
        }
        eksekutor.shutdown();

        try {
            // Tunggu maksimal 1 menit sampai semua thread selesai
            if (eksekutor.awaitTermination(1, TimeUnit.MINUTES)) {
                System.out.println("=====================================");
                System.out.println("HASIL AKHIR TOTAL: " + totalAkhir.get());
            }
        } catch (InterruptedException e) {
            System.err.println("Proses terinterupsi!");
        }
    }
}