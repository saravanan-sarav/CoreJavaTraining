package E_Interface;

public class StudentDetail implements School{
    @Override
    public void schoolAddress() {
        System.out.println("Velachery");
    }

    @Override
    public void schoolName() {
        System.out.println("GHSS");
    }
}
