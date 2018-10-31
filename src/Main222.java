import java.util.Scanner;
 
class Circle {
    double radius;
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }
}
 
class Circular { // 圆锥类
    Circle bottom;
    double height;
    // 完成setBottom方法
 
    public void setBottom(Circle c) {
        this.bottom = c;
    }
 
    public void setHeight(double h) {
        height = h;
    }
 
    double getVolme() {
        return bottom.getArea() * height / 3.0;
    }
}
 
public class Main222 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double h = scanner.nextDouble();
        Circle c = new Circle(radius);
        Circular circular = new Circular();
        circular.setBottom(c);
        circular.setHeight(h);
        System.out.printf("%.2f",circular.getVolme());
        scanner.close();
    }
}