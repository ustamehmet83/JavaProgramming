package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String [] words= {"Java","Java","C#","Python","Python"};

        String element=words[0];

        int frequency=0;

        for (int i = 0; i < words.length; i++) {

            for (int j  = 0; j < words.length; j++) {

               if (words[i].equals(words[j])){
                   frequency++;
                }
            }
            if(frequency==1){
                System.out.println(words[i]);
            }
            frequency=0;
        }













    }
}
