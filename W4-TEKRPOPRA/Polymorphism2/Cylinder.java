package Polymorphism2;
//*****************************************
// Cylinder.java
//
// Represents a sphere.
//*****************************************
public class Cylinder extends Shape
{
    private double radius; //radius in feet
    private double height;

    //----------------------------------
    // Constructor: Sets up the Cylinder.
    //----------------------------------
    public Cylinder(double r, double h)
    {
        super("Cylinder");
        radius = r;
        height = h;
    }

    //-----------------------------------------
    // Returns the surface area of the Cylinder.
    //-----------------------------------------
    public double area()
    {
        return Math.PI * radius * radius *height;
    }

    //-----------------------------------
    // Returns the Cylinder as a String.
    //-----------------------------------
    public String toString()
    {
        return super.toString() + " of radius " + radius + " of height " + height ;
    }
}