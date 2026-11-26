public class ShapeHierarchy {
    static class Shape {
        protected String name;
    public Shape(String name) {
this.name = name;
}
    public double calculateArea() {
return 0.0;
}
@Override
public String toString() {
return "Shape: " + name;
}
}static class Circle extends Shape {
private double radius;

public Circle(String name, double radius) {
super(name); // Call Shape constructor
this.radius = radius;
}
@Override
public double calculateArea() {
return Math.PI * radius * radius;
}
@Override
public String toString() {
return super.toString() + " | Radius: " + radius;
}
}
static class Rectangle extends Shape {
private double length;
private double width;

public Rectangle(String name, double length, double width) {
super(name); // Call Shape constructor
this.length = length;
this.width = width;
}
@Override
public double calculateArea() {
return length * width;
}
@Override
public String toString() {
return super.toString() + " | Length: " + length + ", Width: " + width;
}
}
public static void main(String[] args) {
    Circle c = new Circle("My Circle", 5.0);
System.out.println(c.toString());
System.out.println("Area: " + c.calculateArea());

System.out.println();
Rectangle r = new Rectangle("My Rectangle", 4.0, 6.0);
System.out.println(r.toString());
System.out.println("Area: " + r.calculateArea());
}
}
