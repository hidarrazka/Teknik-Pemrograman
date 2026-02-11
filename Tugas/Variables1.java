package Tugas;

public class Variables1 {
    public static void main(String[] args){
        final double CM_PER_INCH = 2.54;
        double paperHeight = 11;
        double paperWidth = 8.5;
        System.out.println("Paper size in centimeters: "
        + paperWidth * CM_PER_INCH + " by " + paperHeight *
        CM_PER_INCH);       
    }
}
