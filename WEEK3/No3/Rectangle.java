public class Rectangle extends Shape {
    private double width;
    private double lenght;

    public Rectangle(){
        this.width = 1.0;
        this.lenght = 1.0;
    }
    public Rectangle(double width, double lenght){
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color,filled);
        this.lenght = lenght;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double widht){
        this.width = widht;
    }
    public double getLengh(){
        return lenght;
    }
    public void setLength(double lenght){
        this.lenght = lenght;
    }
    public double getArea(){
        return width * lenght;
    }
    public double getPerimeter(){
        return 2*(width+lenght);
    }
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",widht=" + width + ",length="+lenght+"]";
    }
}
