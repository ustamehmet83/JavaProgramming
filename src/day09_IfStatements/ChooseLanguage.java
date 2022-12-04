package day09_IfStatements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 5;

        if (selection <= 5 && selection >= 1) {
            if (selection == 1) {
                System.out.println("for 1 : Hello, thank for your call");
            } else if (selection == 2) {
                System.out.println("for 2 : Hola, gracias para llamar");
            } else if (selection == 3) {
                System.out.println("for 3 : Merhaba, aradığınız için tesekkurler");
            } else if (selection == 4) {
                System.out.println("for 4 : Privet, spasibo za vash zvonok");
            } else {
                System.out.println("for 5 : Merci ,pour votre appel");
            }
        } else {
            System.out.println("invalid selection");
        }


    }
}
