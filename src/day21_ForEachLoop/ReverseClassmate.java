package day21_ForEachLoop;

public class ReverseClassmate {
    public static void main(String[] args) {

        String [] classmates={"Ali Az","Mehmet çok", "Suna Yıldız", "Orhan Albay","Ahmet Yarbay","Mehmet Tuna","Hasan Bal",
                "Turgut Yüksel","Turgut Tarakcı","Salim Yıldız"};

        for (String classmate : classmates) {
            String reversed=" ";
            for (int i = classmate.length()-1; i >=0; i--) {

                 reversed+=classmate.charAt(i);
            }
            System.out.println(reversed);
        }
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
