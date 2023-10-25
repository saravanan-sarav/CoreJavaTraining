package Task_3;

import java.util.ArrayList;

public class Fibanocci {
    void fibonocciGenerator() {
        ArrayList<Integer> fibonocciArr = new ArrayList<>();

        int sum = 0;
        int num1 = 0;
        int num2 = 1;
        fibonocciArr.add(num1);
        fibonocciArr.add(num2);
        for (int i = 0; i < 10; i++) {
            num1 += num2;
            num2 += num1;
            fibonocciArr.add(num1);
            fibonocciArr.add(num2);
        }
        System.out.println(fibonocciArr);
    }
}
