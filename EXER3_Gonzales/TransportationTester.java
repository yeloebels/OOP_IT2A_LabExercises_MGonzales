public class TransportationTester {
    public static void main(String[] args) {
        // Air Transport
        Transportation heli = new Helicopter();
        Transportation plane = new Airplane();
        Transportation shuttle = new SpaceShuttle();

        // Land Transport
        Transportation truck = new Truck();
        Transportation suv = new SUV();
        Transportation tricycle = new Tricycle();
        Transportation motorcycle = new Motorcycle();
        Transportation kariton = new Kariton();

        // Water Transport
        Transportation boat = new Boat();
        Transportation ship = new Ship();

        // Display all transports
        heli.displayInfo();
        plane.displayInfo();
        shuttle.displayInfo();
        truck.displayInfo();
        suv.displayInfo();
        tricycle.displayInfo();
        motorcycle.displayInfo();
        kariton.displayInfo();
        boat.displayInfo();
        ship.displayInfo();
    }
}
