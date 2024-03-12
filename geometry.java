
class parameters {
    int length;
    int breadth;
    int height;
    float radius;

    parameters(int l, int b) {
        length = l;
        breadth = b;
    }

    parameters(int r) {
        radius = r;
    }

    parameters(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;

    }

    float rectArea() {
        return length * breadth;
    }

    float circleArea() {
        return (float) (3.14 * radius * radius);
    }

    int recVolume() {
        return length * breadth * height;
    }
}

class geometry {
    public static void main(String args[]) {
        parameters rectangle = new parameters(3, 5);
        parameters circle = new parameters(5);
        parameters room = new parameters(3, 5, 6);

        float area_rect = rectangle.rectArea();
        float area_circle = circle.circleArea();
        int volume_rec = room.recVolume();

        System.out.println("area of rectangle = " + area_rect);
        System.out.println("area of circle = " + area_circle);
        System.out.println("Volume of rectangle = " + volume_rec);
    }

}
