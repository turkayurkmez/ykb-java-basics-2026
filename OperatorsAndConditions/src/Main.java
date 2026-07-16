import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 1;
        counter +=1;

        int sample = 0;

        System.out.println(sample++);//0 okuduktan sonra 1
        System.out.println(sample);
        System.out.println(++sample);//2

        int number = 10;
                     //11    +       //11
        int total = number++ + ++number;

        System.out.println(total);
        System.out.println("number'ın son değeri:" + number);

        double toplamTutar = 500;
        boolean kargoUcretsizMi = toplamTutar >= 250;
        boolean degerSifirDegilMi = number != 0;

        boolean premiumMusteriMi = true;
        boolean ekstaIndirimVarMi = premiumMusteriMi && toplamTutar >150;
        boolean kampanyaliMi = kargoUcretsizMi || ekstaIndirimVarMi;


        System.out.println("Aşağıdaki trafik ışıklarından birini seçin\n1. Kırmızı\n2.Sarı\n3.Yeşil\n");

        Scanner scanner = new Scanner(System.in);

        String yanit = scanner.next();

        if (yanit.equals("1")){
            System.out.println("DUR!");
        } else if (yanit.equals("2")) {
            System.out.println("DİKKAT!");
        } else if (yanit.equals("3")) {
            System.out.println("GEÇ");
        }
        else{
            System.out.println("Hatalı seçim!");
        }

        switch (yanit){
            case "1":
                System.out.println("DUR!");

                break;
            case "2":
                System.out.println("DİKKAT!");

                break;
            case "3":
                System.out.println("GEÇ");

                break;
            default:
                System.out.println("Hatalı seçim!");

                break;
        }


    }
}