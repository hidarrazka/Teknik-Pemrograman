package Polymorphism2;

public abstract class Shape {

    private String shapeName;

    // Constructor
    public Shape(String name){
        shapeName = name;
    }

    // Abstract method
    public abstract double area();

    public String toString(){
        return shapeName;
    }
}