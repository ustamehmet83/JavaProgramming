package day03_EscapeSequences;
/*
\n:starts a ner line
\t:paragraph
\\:single back slash
\":double quote
 */

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("\tJava is Cool Programming Languages");
        System.out.println("------------------------------------");
        System.out.println("/ \\");// in order to print one backward slash we need to give two backward slashes
        System.out.println("My favorite TV show is \"Game of Thrones\"");
    }
}
