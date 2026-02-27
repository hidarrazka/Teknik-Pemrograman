public class TestCylinder { // save as "TestCylinder.java"
    public static void main(String[] args) {
        
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:" 
            + " radius=\n" + c1.getRadius() 
            + " height=\n" + c1.getHeight() 
            + " base area=\n" + c1.getArea() 
            + " volume=\n" + c1.getVolume()
            + " string=\n" + c1.toString());
            

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:" 
            + " radius=\n" + c2.getRadius() 
            + " height=\n" + c2.getHeight() 
            + " base area=\n" + c2.getArea() 
            + " volume=\n" + c2.getVolume()
            + " string=\n" + c2.toString());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:" 
            + " radius=\n" + c3.getRadius() 
            + " height=\n" + c3.getHeight() 
            + " base area=\n" + c3.getArea() 
            + " volume=\n" + c3.getVolume()
            + " string=\n" + c2.toString());
    }
}

