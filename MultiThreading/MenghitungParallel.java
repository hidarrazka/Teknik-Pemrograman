import java.util.Scanner;
import java.util.concurrent.atomic.LongAdder;

class PenjumlahThread extends Thread {
    private int start, end;
    private long partialSum = 0;

    public PenjumlahThread(int start, int end, String name) {
        super(name);
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println(getName() + " mengerjakan rentang: " + start + " sampai " + end);
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
        System.out.println(getName() + " selesai. Hasil parsial: " + partialSum);
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class MenghitungParallel {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        // 1. Menerima Input
        System.out.print("Masukkan Jumlah Thread: ");
        int numThreads = sc.nextInt();
        System.out.print("Masukkan Angka Akhir: ");
        int limit = sc.nextInt();

        PenjumlahThread[] threads = new PenjumlahThread[numThreads];
        
        // 2. Mekanisme Pembagian Tugas (Divide and Conquer)
        int rangePerThread = limit / numThreads;
        int currentStart = 1;

        for (int i = 0; i < numThreads; i++) {
            int currentEnd = (i == numThreads - 1) ? limit : currentStart + rangePerThread - 1;
            
            threads[i] = new PenjumlahThread(currentStart, currentEnd, "Thread-" + (i + 1));
            threads[i].start();
            
            currentStart = currentEnd + 1;
        }

        // 3. Synchronization (Menunggu semua thread selesai)
        long totalSum = 0;
        for (PenjumlahThread t : threads) {
            t.join(); // Memastikan main thread menunggu thread ini selesai
            totalSum += t.getPartialSum(); // Menggabungkan hasil parsial
        }

        // 4. Output Hasil Akhir
        System.out.println("\n========================================");
        System.out.println("HASIL AKHIR PENJUMLAHAN: " + totalSum);
        System.out.println("========================================");
        
        sc.close();
    }
}