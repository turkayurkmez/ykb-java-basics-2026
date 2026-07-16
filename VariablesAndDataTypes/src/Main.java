import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Sayısal -> Matematiksel
        Sözel
        Mantıksal
        * */

        //Tam sayı - ondalık sayı

        byte yas = 127; //-128 ile 127
        short toplamGun = 32767;
        int siparisId = 2_000_000_000;
        long youtubeIzlenmeSayisi = 2_000_000_000_000_000_000L;

        double double1 = 0.10000000000000000;
        double double2 = 0.20000000000000000;

        float f1 = 0.1f;
        float f2 = 0.2f;

        System.out.println(double1+double2);
        System.out.println(f1 + f2);


        char c = '?';
        String kelime = "olur mu?";


        boolean yapildiMi = false;

        int x = 10;
        int y = x;
        y=20;

        System.out.println(x + "-" + y);

        int[] dizi1 = {1,2,3};
        int[] dizi2 = dizi1;

        dizi2[0] = 9;

        System.out.println(dizi1[0]);
        System.out.println(dizi2[0]);

                        // 0          1       2
        String[] liste = {"Printer","Masa","Sandalye"} ;

        String[] birler = {"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String[] onlar = {"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};

        System.out.println("Bir sayı giriniz:");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int onlarBasamagi = sayi / 10;
        int birlerBasamagi = sayi % 10;

        System.out.println(onlar[onlarBasamagi]+" "+birler[birlerBasamagi]);







    }
}