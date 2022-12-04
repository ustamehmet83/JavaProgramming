package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String str="aabbccddfghh";
        str=removeDuplicates(str);
        System.out.println(str);

    }
//1.create a method that can removeDuplicates duplicated characters from a string and returns the new value

    public static String removeDuplicates(String str) {
        String str1 = "";
        for (char c : str.toCharArray()) {
            if (!str1.contains(""+c)) {
                str1 += c;
            }
        }
        return str1;
    }
}
