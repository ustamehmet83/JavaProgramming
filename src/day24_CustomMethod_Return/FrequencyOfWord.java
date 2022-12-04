package day24_CustomMethod_Return;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java java python java java python python";
        String word = "java";
        int frequency=frequencyOfWord(sentence, word);
        System.out.println(frequency);
    }

    public static int frequencyOfWord(String sentence,String word){
        String [] arr=sentence.split(" ");
        int frequency=0;
        for (String each:arr) {
            if(word.equalsIgnoreCase(each)){
                frequency++;
            }
        }
        return frequency;
    }



}
