package day21_ForEachLoop;

public class Classmates {
    public static void main(String[] args) {
        String [] classmates={"Ali Az","Mehmet çok", "Suna Yıldız", "Orhan Albay","Ahmet Yarbay","Mehmet Tuna","Hasan Bal",
                "Turgut Yüksel","Turgut Tarakcı","Salim Yıldız"};
        for (String classmate : classmates) {

            System.out.println(classmate.charAt(0) +"."+ classmate.charAt(classmate.indexOf(" ")+1));
        }
















    }
}
