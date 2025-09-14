public class Cars {
    private String brand;
    private String color;
    private String plateNo;
    private String chassisNo;

    // No-argument constructor
    public Cars() {
        this.brand = "No Brand";
        this.color = "No Color";
        this.plateNo = "No PlateNumber";
        this.chassisNo = "No Chassis No Yet!";
    }

    // Parameterized constructor
    public Cars(String brand, String color, String plateNo, String chassisNo) {
        this.brand = brand;
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Plate Number: " + this.plateNo);
        System.out.println("Chassis Number: " + this.chassisNo);
        System.out.println("---------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        String[] brands = {"Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes", "Nissan", "Hyundai", "Kia", "Mazda"};
        String[] colors = {"Red", "Blue", "Black", "White", "Silver"};
        String[] plates = {"ABC123", "XYZ456", "DEF789", "GHI321", "JKL654", "MNO987", "PQR159", "STU753", "VWX852", "YZA456"};
        String[] chassis = {"CH001", "CH002", "CH003", "CH004", "CH005", "CH006", "CH007", "CH008", "CH009", "CH010"};

        Cars[] cars = new Cars[10]; // Create 10 cars

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Cars(
                brands[i], 
                colors[i % colors.length], // reuse colors
                plates[i], 
                chassis[i]
            );
        }

        // Display all cars
        for (Cars c : cars) {
            c.displayInfo();
        }
    }
}


