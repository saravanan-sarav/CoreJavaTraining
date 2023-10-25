package B_Class;


public class PracticeClass extends Testing{
    void start() {
        System.out.println("Started");
    }

    public static void main(String[] args) {
        PracticeClass practiceClassObj = new PracticeClass();
        practiceClassObj.start();
        Testing testingObj = new Testing();
        testingObj.end();
    }
}

