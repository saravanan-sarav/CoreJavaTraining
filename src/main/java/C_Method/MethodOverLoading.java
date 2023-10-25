package C_Method;

public class MethodOverLoading {
    void method() {
        System.out.println("This is Method");
    }

    void method(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoadingObj = new MethodOverLoading();
        methodOverLoadingObj.method();
        methodOverLoadingObj.method("This is OverLoading");
    }
}
