package D_Inheritance;

public class Bike extends Vehicle{
    String getDoors(){
        return "No Doors";
    }

    public Bike(int b) {
        System.out.println(b);
    }

    public Bike() {
        System.out.println("Without Instruction");
    }

    int getSeats(){
        return 2;
    }
}
