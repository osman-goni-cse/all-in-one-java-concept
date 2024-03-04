package PillarsOfOOP.Encapsulation.Exercise_1;

import java.io.IOException;

/*
 * You are given a geometric figure box with parameters length, width and height. 
 * Model a class Box that that can be instantiated by the same three parameters. 
 * Expose to the outside world only methods for its surface area, lateral surface area and its volume 
 * (formulas: http://www.mathwords.com/r/rectangular_parallelepiped.htm).

On the first three lines you will get the length, width and height. 
On the next three lines print the surface area, lateral surface area and the volume of the box:

Examples
    Input	
        2
        3
        4	
    Output
        Surface Area - 52.00
        Lateral Surface Area - 40.00
        Volume – 24.00
    1.3
    1
    6	
    Surface Area - 30.20
    Lateral Surface Area - 27.60
    Volume - 7.80
 */
public class GeomatricBox {
    private double length;
    private double width;
    private double height;

    public GeomatricBox(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);   
        this.setHeight(height); 
    }

    public void setLength(double length) {
        if(length <= 0) {
            throw new IllegalArgumentException("Length can't be less than or equal to zero.");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if(width <= 0) {
            throw new IllegalArgumentException("Width can't be less than or equal to zero");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if(height <= 0) {
            throw new IllegalArgumentException("Height can't be less than or equal to zero");
        }
        this.height = height;
    }

    public double surfaceArea() {
        return 2*length*width + lateralSurfaceArea();
    }

    public double lateralSurfaceArea() {
        return 2*length*height + 2*width*height;
    }

    public double volume() {
        return length*width*height;
    }

    public void printArea() {
        System.out.println("Surface Area: " + surfaceArea());
        System.out.println("Lateral Surface Area: " + lateralSurfaceArea());
        System.out.println("Volume: " + volume());
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Geomatric box solution");

        GeomatricBox box1 = new GeomatricBox(2, 3, 4);
        GeomatricBox box2 = new GeomatricBox(1.3, 1, 6);

        box1.printArea();
        box2.printArea();

        try {
            GeomatricBox box3 = new GeomatricBox(1, 1, -5);
            box3.printArea();
            
        } catch (IllegalArgumentException iae) {
            // TODO: handle exception
            System.out.println(iae.getMessage());
        }

    }
}
