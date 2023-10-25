package C_Method;

public class MethodPractice {
    void call(){
        System.out.println("Method example");
    }

    static int add(){
        return 2+2;
    }

    public static void main(String[] args) {
        MethodPractice methodPracticeObj = new MethodPractice();
        methodPracticeObj.call();
        System.out.println("Sum of Two Number is = "+add());
        MethodOverLoading methodOverLoadingObj = new MethodOverLoading();
        methodOverLoadingObj.method("Hii From Other class");
        methodOverLoadingObj.method();
    }
}
