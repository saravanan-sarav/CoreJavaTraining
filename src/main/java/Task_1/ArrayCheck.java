package Task_1;

public class ArrayCheck {
    int[] a = {1, 2, 6, 7,8,14,1, 32, 4, 12, 32};


    void arraysValueCheck() {
        for (int i = 0; i<a.length;i++){
            for (int j = 0;j<a.length;j++){
                if(a[i]+a[j]==15){
                    System.out.println(a[i]+" and "+ a[j]+" are producing 15");
                }
            }
        }
    }
}
