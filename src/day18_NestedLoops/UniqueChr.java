package day18_NestedLoops;

public class UniqueChr {
    public static void main(String[] args) {
        String str = "aabefgcccddaa";


        String word = "";

        for (int j = 0; j < str.length(); j++) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if(count>1){
                continue;
            }
            word += str.charAt(j);
        }
        System.out.println(word);
    }
}
