package iuh.fit.se;

import java.sql.SQLOutput;

public class TestRectangle {

    public static void main(String[] args) {


        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5, 4.0);
        System.out.println("Length r2: " + r1.getLength());
        System.out.println("Length r2: " + r2.getWidth());

        r1.setLength(20);
        //r2.setWidth(-10);
        System.out.println("Area r2: " + r1.getArea());
    }
}