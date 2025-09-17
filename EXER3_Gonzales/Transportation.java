
class Transportation{
    String name;

    public Transportation(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("This is a mode of transportation: " + name);
    }
}

// ------------------ AIR TRANSPORT ------------------
class AirTransport extends Transportation {
    public AirTransport(String name) {
        super(name);
    }
}

class Helicopter extends AirTransport {
    public Helicopter() {
        super("Helicopter");
    }
}

class Airplane extends AirTransport {
    public Airplane() {
        super("Airplane");
    }
}

class SpaceShuttle extends AirTransport {
    public SpaceShuttle() {
        super("Space Shuttle");
    }
}

// ------------------ LAND TRANSPORT ------------------
class LandTransport extends Transportation {
    public LandTransport(String name) {
        super(name);
    }
}

class Truck extends LandTransport {
    public Truck() {
        super("Truck");
    }
}

class SUV extends LandTransport {
    public SUV() {
        super("SUV");
    }
}

class Tricycle extends LandTransport {
    public Tricycle() {
        super("Tricycle");
    }
}

class Motorcycle extends LandTransport {
    public Motorcycle() {
        super("Motorcycle");
    }
}

class Kariton extends LandTransport {
    public Kariton() {
        super("Kariton");
    }
}

// ------------------ WATER TRANSPORT ------------------
class WaterTransport extends Transportation {
    public WaterTransport(String name) {
        super(name);
    }
}

class Boat extends WaterTransport {
    public Boat() {
        super("Boat");
    }
}

class Ship extends WaterTransport {
    public Ship() {
        super("Ship");
    }
}

