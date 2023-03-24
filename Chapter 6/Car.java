public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The " + year + " " + make + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println("The " + year + " " + make + " " + model + " is stopping.");
    }
}

