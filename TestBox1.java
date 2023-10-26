import java.util.*;
class Box {
    private double width;
    private double height;
    private double depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double Volume() {
        return width * height * depth;
    }
}
public class TestBox1 {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box(5, 8, 9);
        double volume1 = box1.Volume();
        double volume2 = box2.Volume();
        System.out.println("Volume of box1: " + volume1);
        System.out.println("Volume of box2: " + volume2);
    }
}

