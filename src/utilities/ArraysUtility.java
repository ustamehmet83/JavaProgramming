package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    //prints each double of a double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    //prints each char of a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //prints each String of a String array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number for integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //returns the maximum number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //returns the min number for integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the min number for double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static int[] reverseArray(int[] arr1) {
        int[] reverse = new int[arr1.length];
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr1[i];
        }
        return reverse;
    }


    //checks if the given integer is contained in the given array.returns boolean
    public static boolean contains(int[] numbers, int number) {
        boolean isContain = false;
        for (int each : numbers) {
            if (number == each) {
                isContain = true;
            }
        }
        return isContain;
    }

    //checks if the given double is contained in the given array.returns boolean
    public static boolean contains(double[] numbers, double element) {
        boolean isContain = false;
        for (double each : numbers) {
            if (element == each) {
                isContain = true;
            }
        }
        return isContain;
    }

    //checks if the given char is contained in the given array.returns boolean
    public static boolean contains(char[] array, char element) {
        boolean isContain = false;
        for (char each : array) {
            if (element == each) {
                isContain = true;
            }
        }
        return isContain;
    }

    //checks if the given String is contained in the given array.returns boolean
    public static boolean contains(String[] array, String element) {
        boolean isContain = false;
        for (String each : array) {
            if (element == each) {
                isContain = true;
            }
        }
        return isContain;
    }


    //adds the given element to array, returns a new array
    public static int[] addElement(int[] arr, int element) {
        int[] arr2 = new int[arr.length + 1];

        int i = 0;
        for (int each : arr) {
            arr2[i++] = each;
        }
        arr2[i] = element;
        return arr2;
    }

    public static double[] addElement(double[] arr, double element) {
        double[] arr2 = new double[arr.length + 1];
        int i = 0;
        for (double each : arr) {
            arr2[i++] = each;
        }
        arr2[i] = element;
        return arr2;
    }

    public static String[] addElement(String[] arr, String element) {

        String[] arr2 = new String[arr.length + 1];
        int i = 0;
        for (String each : arr) {
            arr2[i++] = each;
        }
        arr2[i] = element;
        return arr2;
    }

    public static char[] addElement(char[] arr, char element) {

        char[] arr2 = new char[arr.length + 1];
        int i = 0;
        for (char each : arr) {
            arr2[i++] = each;
        }
        arr2[i] = element;
        return arr2;
    }


    public static int frequencyOfElement(int[] array, int element) {
        int frequency = 0;
        for (int each : array) {
            if (each == element) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int frequencyOfElement(double[] array, double element) {
        int frequency = 0;
        for (double each : array) {
            if (each == element) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int frequencyOfElement(char[] array, char element) {
        int frequency = 0;
        for (char each : array) {
            if (each == element) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int frequencyOfElement(String[] array, String element) {
        int frequency = 0;
        for (String each : array) {
            if (each.equals(element)) {
                frequency++;
            }
        }
        return frequency;
    }


    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] arr) {
        int[] result = {};
        for (int each : arr) {
            if ((ArraysUtility.frequencyOfElement(arr, each)) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] arr) {
        double[] result = {};
        for (double each : arr) {
            if ((ArraysUtility.frequencyOfElement(arr, each)) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] arr) {
        char[] result = {};
        for (char each : arr) {
            if ((ArraysUtility.frequencyOfElement(arr, each)) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static String[] uniqueElements(String[] arr) {
        String[] result = {};
        for (String each : arr) {
            if ((ArraysUtility.frequencyOfElement(arr, each)) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    // removes the element which given index number  from the array,return new array
    public static int[] remove(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }

        int[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static double[] remove(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }

        double[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static char[] remove(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }

        char[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static String[] remove(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }

        String[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }


    // merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //reverses the given array, returns a new array
    public static int[] reverse(int[] arr1) {

        int[] result = new int[arr1.length];
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr1[i];
        }
        return result;
    }

    public static double[] reverse(double[] arr1) {

        double[] result = new double[arr1.length];
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr1[i];
        }
        return result;
    }

    public static char[] reverse(char[] arr1) {

        char[] result = new char[arr1.length];
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr1[i];
        }
        return result;
    }

    public static String[] reverse(String[] arr1) {

        String[] result = new String[arr1.length];
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr1[i];
        }
        return result;
    }



    //replace the element of the array at given index with new element,and returns the new array
    public static int [] replace(int [] array, int index, int element){
        if(index<0 || index>array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        array[index]=element;
        return array;
    }
    public static double [] replace(double [] array, int index, double element){
        if(index<0 || index>array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        array[index]=element;
        return array;
    }
    public static char [] replace(char [] array, int index, char element){
        if(index<0 || index>array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        array[index]=element;
        return array;
    }
    public static String [] replace(String [] array, int index, String element){
        if(index<0 || index>array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        array[index]=element;
        return array;
    }


    //replaces all the element of the array that matching with the given old element
    // with the given new element, and returns the new array
    public static int [] replaceAll(int [] array, int elementOld,int elementNew){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==elementOld){
                array[i]=elementNew;
            }
        }
        return array;
    }
    public static double [] replaceAll(double [] array, double elementOld,double elementNew){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==elementOld){
                array[i]=elementNew;
            }
        }
        return array;
    }
    public static char [] replaceAll(char [] array, char elementOld,char elementNew){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==elementOld){
                array[i]=elementNew;
            }
        }
        return array;
    }
    public static String [] replaceAll(String [] array, String elementOld,String elementNew){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(elementOld)){
                array[i]=elementNew;
            }
        }
        return array;
    }


    //removes the duplicates from the given array, returns the new array
    public static int [] removeDuplicates(int [] arr1){
        int [] result={};
        for (int each:arr1) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }
    public static double [] removeDuplicates(double [] arr1){
        double [] result={};
        for (double each:arr1) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }
    public static char [] removeDuplicates(char [] arr1){
        char [] result={};
        for (char each:arr1) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }
    public static String [] removeDuplicates(String [] arr1){
        String [] result={};
        for (String each:arr1) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }

}



