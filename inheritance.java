class Vehicle {
    int model;
    int wheels;
    String color;

    Vehicle(int model, int wheels, String color) {
        this.model = model;
        this.wheels = wheels;
        this.color = color;
    }

    void drive() {
        System.out.println("Driving from vehicle class ");
    }
}

class Bike extends Vehicle {

    int speed;

    Bike(int speed, int model, int wheels, String color) {
        super(model, wheels, color);
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }

}

class Maruti extends Vehicle {
    boolean racingCar;

    Maruti(boolean racingCar, int model, int wheels, String color) {
        super(model, wheels, color);
        this.racingCar = racingCar;

    }

}

public class inheritance {

    public static void main(String[] args) {
        Maruti BMW = new Maruti(false, 23, 4, "Red");
        Bike Bullet = new Bike(120, 55, 2, "Black");

        BMW.drive();
        System.out.println(Bullet.getSpeed());
        System.out.println(BMW.color);
    }

}
