package day15_ForLoop;

public class ForLoopIntro {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 10; i++) {
            for (int i2 = 0; i2 < 10; i2++) {
                for (int i3 = 0; i3 < 10; i3++) {
                    System.out.print(i + "" + i2 + "" + i3 + " ");
                }
            }
        }
    }*/
        /*
        int x=0;
        int y=1;
        System.out.print(" "+ x+" "+y);
        for (int i = 0; i < 10; i++) {
            x=x+y;
            y=y+x;
            System.out.print(" "+ x+" "+y);

        }
        */
        for (int bölünen = 1; bölünen < 1000; bölünen++) {
            int toplam = 0;
            for (int bölen = 1; bölen < bölünen; bölen++) {
                if (bölünen % bölen == 0) {
                    toplam = toplam + bölen;
                }
            }
            if (toplam == bölünen) {
                System.out.println(toplam);
            }


        }
    }
}
