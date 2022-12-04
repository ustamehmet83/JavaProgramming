package day19_NestedLoopRecap;

public class IndexNumOfFirstDupChr {
    public static void main(String[] args) {

        String str = "abcddefgh";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if (count != 1) {
                System.out.println(j);
                break;
            }
        }


    }


}
