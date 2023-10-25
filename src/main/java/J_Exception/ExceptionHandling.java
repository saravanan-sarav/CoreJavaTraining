package J_Exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 12 / 0;
        } catch (Exception e) {
            System.out.println();

        }
    }
}

class TestFile extends Exception {
    void add() throws Exception {
        System.out.println("Hello");
    }

}
