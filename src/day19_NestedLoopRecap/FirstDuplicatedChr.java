package day19_NestedLoopRecap;

public class FirstDuplicatedChr {
    public static void main(String[] args) {
        String str = "abcdeff";
        String word = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (ch == str.charAt(i)) {
                    count++;
                }

            }

            if (count != 1) {

                System.out.println(ch);
                break;
            }


        }


    }
}
