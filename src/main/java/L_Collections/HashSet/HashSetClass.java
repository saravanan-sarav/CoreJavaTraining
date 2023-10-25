package L_Collections.HashSet;


import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        Integer number = 3;
        hashSet.add(3);
        hashSet.add(38);
        hashSet.add(23);
        for (int i : hashSet) {
            System.out.println(i);
        }
    }
}
