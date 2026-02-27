public class Main {
    public static void main(String[] args){
        System.out.println("Test Bentuk");
        Shape s1 = new Shape("red", false);
        System.out.println(s1);
        System.out.println("Test Lingkaran");
        Circle c1 = new Circle(7.4, "yellow", true);
        System.out.println(c1);
        System.out.printf("Luas: %.2f, Keliling: %.2f", c1.getArea(), c1.getPerimeter());
        System.out.println("Test Persegi Panjang");
        Rectangle r1 = new Rectangle(4.0,3.0,"black", true);
        System.out.println(r1);
        System.out.printf("Luas: %.2f, Keliling: %.2f", r1.getArea(), r1.getPerimeter());
        System.out.println();
        System.out.println("Test Persegi");
        Square e1 = new Square(5.0, "yellow", true);
        System.out.println(e1);
        System.out.printf("Luas: %.2f, Keliling: %.2f", e1.getArea(), e1.getPerimeter());
        e1.setSide(10.0);
        System.out.println("After changing side: " + e1);
        System.out.printf("Area: %.2f, Perimeter: %.2f\n",e1.getArea(), e1.getPerimeter());
    }
}
