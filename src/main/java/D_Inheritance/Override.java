package D_Inheritance;

public class Override {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("From Vehicle Class - Wheels - "+car.getCarWheels());
        System.out.println("From Car Class - Doors - "+car.getDoors());
        System.out.println("From Car class - Seats - "+car.getSeats());
        System.out.println("From Vehicle Calss - color - "+ car.getColor());
        System.out.println("\nFor Bike\n");
        Bike bike = new Bike();
        System.out.println("From Vehicle Class - WHeels - "+bike.getBikeWheels());
        System.out.println("From Bike Class - Doors - "+ bike.getDoors());
        System.out.println("From Bike Class - Seats - "+bike.getSeats());
        System.out.println("From Vehicle Class - color - "+ bike.getColor());
    }
}
