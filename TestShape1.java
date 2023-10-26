interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private String color;
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle[color=" + color + ", width=" + width + ", height=" + height + "]";
    }
}

class Triangle implements Shape {
    private String color;
    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle[color=" + color + ", base=" + base + ", height=" + height + "]";
    }
}

public class TestShape1 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());

        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());

        // WE cannot create an instance of an interface directly.
        // Shape s3 = new Shape("green"); HENCE IT'S WRONG
    }
}

