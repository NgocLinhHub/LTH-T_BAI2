package iuh.fit.se;

/**
 *
 */
public class Rectangle {

    // Attributes
    private double length;
    private double width;

    // Metthods
    public Rectangle() {

        this ( 20.5, 4.0);
    }

    /**
     *
     * @param l
     * @param w
     */
    public Rectangle(double length, double width) {
        if(length < 0.0 || width < 0.0)
            throw new IllegalArgumentException("Length and width must be greater than 0”");
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    /**
     * Descripion:
     *
     */
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0)
            throw new IllegalArgumentException("Width must not be greater than 0.");
        this.width = width;
    }

    public double getArea() {

        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}

