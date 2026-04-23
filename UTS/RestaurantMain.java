package UTS;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Pizza",25000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Spagetthi", 80000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Steak", 60000, 30);
        menu.tampilMenuMakanan();
    }
}
