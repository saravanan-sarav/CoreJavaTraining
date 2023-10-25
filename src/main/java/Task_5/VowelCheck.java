package Task_5;

import java.util.ArrayList;

public class VowelCheck {
    void vowelChecker() {
        String data = "kumaransystemsprivatelimitedaaaoo";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int jCheck = 0;
        for (int i = 0; i < vowels.length; i++) {
            int count = 0;
            for (int j = 0; j < data.length(); j++) {
                if (vowels[i] == data.charAt(j)) {
                    count += 1;
                    jCheck = j;
                }

            }
            if (count > 0) {
                System.out.println(data.charAt(jCheck) + " is Repeated " + count + " times.");
            }
        }
    }

    void vowelRemover() {
        String data = "kumaransystemsprivatelimitedaaaoo";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String vow="aeiou";
        String str = "";
        for (int i = 0; i < data.length(); i++) {
            for (int j = 0; j < vow.length(); j++) {
                if (data.charAt(i) != vow.charAt(0)) {

                }
                str += data.charAt(i);
            }

        }
        System.out.println(str);
    }
}

