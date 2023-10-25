package H_Threads;

public class ThreadClass extends Thread {
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
    }

}
