class Vehicle {
    void Engine() {
        System.out.println("It has engine");
    }

    void Braker() {
        System.out.println("Vehicle has Brakers");
    }

}

class motorcycle extends Vehicle {
    void wheels() {
        System.out.println("Motorcycle has two wheels");
    }
}

class Car extends Vehicle {
    void MusicPlayer() {
        System.out.println("Car has music player ");
    }
}

class Truck extends Vehicle {
    void Loading() {
        System.out.println("Truck can load the luggage");
    }
}

class EXPERIMENT1 {
    public static void main(String[] args) {

        // for cars
        Car C1 = new Car();
        C1.MusicPlayer();
        C1.Engine();
        C1.Braker();

        // for motocycle
        motorcycle M1 = new motorcycle();
        M1.wheels();
        M1.Engine();
        M1.Braker();

        // for truck
        Truck T1 = new Truck();
        T1.Loading();
        T1.Engine();
        T1.Braker();

    }
}