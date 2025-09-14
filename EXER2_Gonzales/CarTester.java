public class CarTester {
    public static void main(String[] args) {
        String[] brands = {"Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes", "Nissan", "Hyundai", "Kia", "Mazda"};
        String[] colors = {"Red", "Blue", "Black", "White", "Silver"};
        String[] plates = {"ABC123", "XYZ456", "DEF789", "GHI321", "JKL654", "MNO987", "PQR159", "STU753", "VWX852", "YZA456"};
        String[] chassis = {"CH001", "CH002", "CH003", "CH004", "CH005", "CH006", "CH007", "CH008", "CH009", "CH010"};

        Car[] cars = new Car[10]; // Create 10 cars

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(
                brands[i], 
                colors[i % colors.length], // reuse colors cyclically
                plates[i], 
                chassis[i]
            );
        }

        // Display all cars
        for (Car c : cars) {
            c.displayInfo();
        }
    }
}