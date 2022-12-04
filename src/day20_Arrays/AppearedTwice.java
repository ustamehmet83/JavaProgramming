package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        chars[0] = 'A';


        for (int j = 0; j < chars.length; j++) {
            int fluequency = 0;

            for (int i = 0; i < chars.length; i++) {

                if (chars[i] == chars[j]) {
                    fluequency++;
                }
            }
            if (fluequency == 2) {
                System.out.println(chars[j]);
            }
        }


    }
}
