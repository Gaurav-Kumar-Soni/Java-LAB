class Shape {
    float l, b, h, r;

    float get_perimeter() {
        return l + b;
    }

    float get_area() {
        return l * b;
    }
}

class Circle extends Shape {
    float radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public float get_perimeter() {
        return (float) (2 * 3.14 * radius);
    }

    @Override
    public float get_area() {
        return (float) (3.14 * radius * radius);
    }
}

public class Question2 {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);

        float param = c1.get_perimeter();
        float area = c1.get_area();

        System.out.println("Area of Circle : " + area);
        System.out.println("Perimeter of Circle: " + param);

    }
}
