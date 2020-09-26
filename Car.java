public class Car {
    private int seatCount;
    private String brand;
    private double horsepower;

    public Car(int seatCount, String brand, double horsepower) {
        this.seatCount = seatCount;
        this.brand = brand;
        this.horsepower = horsepower;
    }

    public int getSeatCount() {
        return this.seatCount;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getHorsepower() {
        return this.horsepower;
    }

    public void printInfo() {
        System.out.println("Seatct: " + Integer.toString(this.seatCount)
                            + " Brand: " + this.brand
                            + " Horsepower: " 
                            + Double.toString(this.horsepower));
                            
    }
}