package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantagesOfThrowsKeywords2 {
    public static void main(String[] args) throws InterruptedException {
        method1();
        method2();
        method3();

        String str=null;
        try {
            System.out.println(str.charAt(0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    public static void method() throws InterruptedException{
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void method1() throws InterruptedException {

        //new FileInputStream("");
        Thread.sleep(3000);

    }

    public static void method2() throws InterruptedException {
        method1();
    }

    public static void method3() throws InterruptedException {
        method2();
        Thread.sleep(3000);
    }

    public static void method4() throws Exception {
        method3();

    }
}
