package UTS;
class Player{
    String name; // yang bisa dibaca dan tulis
    public int exp;
    private int health;
    Player(String name, int exp, int health){
        this.name = name;
        this.exp =exp;
        this.health = health;
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Player player1 = new Player("Haidar",100,85);
        System.out.println(player1.name);
        // player1.health // error
    }
}
