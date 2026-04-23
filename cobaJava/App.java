public class App {
    public static void main(String[] args) {
        String angka = "1990";
        // Penggunaan Parse Int
        int angkaInt = Integer.parseInt(angka);
        System.out.println(angkaInt + 100);
        // Penggunaan valueOf
        String nilai = "80";
        int nilaiInt = Integer.valueOf(nilai);
        System.err.println(nilaiInt);
        // Penggunaan compareTo
        Integer a = 100;
        Integer b = 85;
        Integer c = 85;
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(b.compareTo(a));
        // Penggunaan toString;
        Integer tahun = 2025;
        String tahunStr = tahun.toString();
        System.out.println("Sekarang Tahun : " + tahunStr);
    }

}