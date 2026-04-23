public class StringManipulation {
    
    public static void main(String[] args) {
        String depan = "   Haidar    ";
        String belakang = "    Azka   ";
        String pesan = depan.concat(" ").concat(belakang);
        System.out.println(pesan.length());
        System.out.println(pesan.charAt(4));
        System.out.println(pesan.indexOf("Azka"));
        System.out.println(pesan);
        System.out.println(pesan.toUpperCase());
        String haji = "Masjidil Aqsa";
        System.out.println(haji.replace("Aqsa","Madinah"));
    }
}