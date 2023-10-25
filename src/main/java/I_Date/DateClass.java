package I_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E yyyy/MM/dd");
        System.out.println(simpleDateFormat.format(date));

    }
}
