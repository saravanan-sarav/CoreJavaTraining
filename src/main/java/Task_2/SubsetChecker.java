package Task_2;

import java.util.ArrayList;

public class SubsetChecker {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] b = {3, 4, 5, 6, 7, 8};
    ArrayList<Integer> newArr = new ArrayList<Integer>();
    boolean flag = true;
    boolean check() {
        if (newArr.size() == b.length) {
            return flag = false;
        } else {
            return flag;
        }
    }
    void startCheck() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    newArr.add(b[j]);
                }
            }
        }
        if (check()) {
            System.out.println("the Array two is Not a Subset of Array one");

        } else {
            System.out.println("the Array two is Subset of Array one");
        }
    }
}
