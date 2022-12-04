package day21_ForEachLoop;

public class CommonElement {
    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5};
        int arr2[]={4,5,6,7,8};

        for (int i1:arr1) {

            for (int i2:arr2) {
                if(i1==i2){
                    System.out.print(i1);
                }
            }

        }




    }
}
