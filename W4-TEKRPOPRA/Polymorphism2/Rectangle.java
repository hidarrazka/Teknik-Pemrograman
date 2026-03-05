package Polymorphism2;

//*****************************************
// Sphere.java
//
// Represents a sphere.
//*****************************************
public class Rectangle extends Shape
{
    private double length; //radius in feet
    private double width;

    //----------------------------------
    // Constructor: Sets up the sphere.
    //----------------------------------
    public Rectangle(double l, double w)
    {
        super("Rectangle");
        length = l;
        width = w;
    }

    //-----------------------------------------
    // Returns the surface area of the sphere.
    //-----------------------------------------
    public double area()
    {
        return length * width;
    }

    //-----------------------------------
    // Returns the sphere as a String.
    //-----------------------------------
    public String toString()
    {
        return super.toString() + " of lenght " + length + " of width " + width;
    }
}