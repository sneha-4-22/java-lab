class Rectangle {
    double l;
    double b;
    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    public double calculateArea() {
        return l * b;
    }
}
public class RectangleArea{
    public static void main(String[] args) {
        Rectangle rc=new Rectangle(14, 90);
        System.out.println(rc.calculateArea());
    }
}