public class ImmutableExample{
    public static void main(String[] args) {
        String s1 = "Java";
        System.out.println("Sebelum Diubah");
        System.out.println("s1 =" + s1);
        s1.concat(" Programming ");
        System.out.println("Setelah concat tanpa disimpan");
        String s2 = s1.concat(" Programming ");
        System.out.println("Setelah concat disimpan");
        System.out.println("s2 = " + s2);

    }
    
}