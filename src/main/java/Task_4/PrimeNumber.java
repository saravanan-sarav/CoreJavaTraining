package Task_4;

import java.util.ArrayList;

public class PrimeNumber {
    ArrayList<Integer> primeNumberArr = new ArrayList<>();
    int temp=0;

    void primeNumberGenerator() {
        primeNumberArr.add(2);
        primeNumberArr.add(3);
        for (int i = 1; i <= 1000 ; i++) {
            if (temp < 95) {
//                5
                temp = (6 * i) - 1;
                primeNumberArr.add(temp);
//                7
                temp = (6 * i) + 1;
                System.out.println(i);
                primeNumberArr.add(temp);
            } else {
                break;
            }


        }
        System.out.println(primeNumberArr);
    }
}
