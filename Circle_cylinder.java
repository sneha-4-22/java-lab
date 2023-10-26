import java.util.*;
class Circle{
  private String color;
  private double radius;
  public Circle(){
     this.radius=1.0;
     this.color="red";
  }
  public Circle(double radius){
    this.radius=radius;
    this.color="red";
  }

  public Circle(String color){
    this.color=color;
    this.radius=1.0;
  }
  public Circle(String color,double radius){
    this.color=color;
    this.radius=radius;
  }
  public double getRadius(){
     return radius;
  }
  public void setRadius(double radius){
    this.radius=radius;
  }
  public String getColor(){
     return color;
  }
  public void setColor(String color){
    this.color=color;
  }
  public double getArea() {
        return 3.14 * radius * radius;
    }
}
class Cylinder extends Circle{
  private double height;
  public Cylinder(){
      super();
      this.height=1.0;;
  }
  public Cylinder(double height,double radius){
    super(radius);
    this.height =height;
  }
  public Cylinder(double radius, double height, String color) {
        super(color,radius);
        this.height = height;
    }
     public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }
}
public class Circle_cylinder {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        Cylinder cy1 = new Cylinder(8.9,8.32);
        System.out.println(cy1.getArea());
        Circle c3 = new Circle("blue",2.0);
        System.out.println(c3.getArea());
    }
}