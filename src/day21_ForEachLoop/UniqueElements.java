package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "C#", "Python", "Python", "C++"};

        String element = words[0];

        int frequency = 0;

        for (String word : words) {
            frequency = 0;
            for (String s : words) {
                if (word == s)
                    frequency++;
            }
            if (frequency == 1)
                System.out.println(word);
        }
    }

}

