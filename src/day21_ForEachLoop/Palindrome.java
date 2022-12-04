package day21_ForEachLoop;

public class Palindrome {
    public static void main(String[] args) {
        String [] arr={"anna","Level","ama","Java"};

        int count=0;
        for (String s : arr) {
            String reversed="";
            s=s.toLowerCase();
            for (int i = s.length()-1; i >= 0 ; i--) {

                reversed+=s.charAt(i);

                if (reversed.equals(s)){
                    count++;
                }

            }

        }
        System.out.println(count);










    }
}
