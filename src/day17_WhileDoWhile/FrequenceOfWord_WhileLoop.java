package day17_WhileDoWhile;

public class FrequenceOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";

        int frequence = 0;
        while (str.contains("Java")) {

            str = str.replaceFirst("Java", "");
            frequence++;
        }
        System.out.println(frequence);
        System.out.println("----------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat";

        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);


        System.out.println("----------------------------------");
        String s = "java java java java python python python ";
        int countJava = 0;
        int countPython= 0;
        while (s.contains("java")){
            s=s.replaceFirst("java","");
            countJava++;

        }
        while (s.contains("python")){
            s=s.replaceFirst("python","");
            countPython++;
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);



    }
}
