
import java.util.*;

/*
 * This class is an abstract class with variable area and some methods
 * input() methods takes the input form the user 
 * calculate() metood calculates the area
 * dispaly() method shows the area value
 */
abstract class Shape {
    protected float area;

    abstract public void input();

    abstract public void calculate();

    abstract public void display();
}

// The class Rectangle extends the class Shape and gives the implementetion of
// the methods
class Rectangle extends Shape {
    float length;
    float breadth;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Rectangle :");
        System.out.println("Enter the length of Rectangle :");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of Rectanlge :");
        breadth = sc.nextFloat();
    }

    public void calculate() {
        area = length * breadth;
    }

    public void display() {
        System.out.println("The area of Rectangle is :" + area);
        System.out.println();
    }
}

// The class Circle also extends the class Shape and gives the implementetion of
// the methods
class Circle extends Shape {
    float radius;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Circle :");
        System.out.println("Enter the radius of Circle :");
        radius = sc.nextFloat();
    }

    public void calculate() {
        area = 3.14f * radius * radius;
    }

    public void display() {
        System.out.println("The area of Circle is :" + area);
        System.out.println();
    }
}

// The class Square also extends the class Shape and gives the implementetion of
// the methods
class Square extends Shape {
    float length;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Square :");
        System.out.println("Enter the length of Square :");
        length = sc.nextFloat();
    }

    public void calculate() {
        area = length * length;
    }

    public void display() {
        System.out.println("The area of Square is :" + area);
        System.out.println();
    }
}

// The class Square also extends the class Shape and gives the implementetion of
// the methods
class Triangle extends Shape {
    Scanner sc = new Scanner(System.in);

    float base, height;

    public void input() {
        System.out.println("Triangle\n");
        System.out.println("Enter the base of Trinagle:");
        base = sc.nextFloat();
        System.out.println("Enter the height of Triangle:");
        height = sc.nextFloat();
    }

    public void calculate() {
        area = base * height * 0.5f;
    }

    public void display() {
        System.out.println("The area of the Triangle is :" + area);
    }
}
// This class is used for achieve the loose coupling
class Call {
    public void callMethods(Shape s) {
        s.input();
        s.calculate();
        s.display();
    }
}

// This is the main class used for call all class
public class Main {
    static {
        System.out.println("\nWelcome to The Console based Application of Calculating Area of Different Shapes\n");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle=new Triangle();
        Call c = new Call();
        c.callMethods(rectangle);
        c.callMethods(circle);
        c.callMethods(square);
        c.callMethods(triangle);
    }
}
