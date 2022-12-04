package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int score = 160;
        String result;

        result = (score >= 0 && score <= 100) ? (score >= 60) ? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);


    }


}
