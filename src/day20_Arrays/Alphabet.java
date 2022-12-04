package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets=new char[26]; //Z~A

        alphabets[0]='Z';

        for (int i = 0,j='Z'; i < alphabets.length; i++,j--) {
            alphabets[i]=(char)j;
        }
        System.out.println(alphabets);//ZYXWVUTSRQPONMLKJIHGFEDCBA
        System.out.println(Arrays.toString(alphabets));//[Z, Y, X, W, V, U, T, S, R, Q, P, O,
        // N, M, L, K, J, I, H, G, F, E, D, C, B, A]



        char[] alphabet2=new char[26]; //Z~A

        for (char i = 0,j='Z'; i < alphabets.length; i++,j--) {
            alphabet2[i]=j;
        }
        System.out.println(alphabet2);//ZYXWVUTSRQPONMLKJIHGFEDCBA
        System.out.println(Arrays.toString(alphabet2));//[Z, Y, X, W, V, U, T, S, R, Q, P, O,
        // N, M, L, K, J, I, H, G, F, E, D, C, B, A]


    }
}
