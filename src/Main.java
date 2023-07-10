abstract class Vehicle{
    abstract public void Start();
    abstract public void Stop();
}

class Car extends Vehicle{
    public void Start(){
        System.out.println("Car Started");
    }
    public void Stop(){
        System.out.println("Car Stopped");
    }
}

class Motorcycle extends Vehicle{
    public void Start(){
        System.out.println("Motorcycle Started");
    }
    public void Stop(){
        System.out.println("Motorcycle Stopped");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.Start();
        car.Stop();
        motorcycle.Start();
        motorcycle.Stop();

    }
}