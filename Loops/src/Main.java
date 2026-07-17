import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        * Bir sınıftaki öğrencileri ve puanlarını tutan bir uygulama geliştireceğiz.
        *  1. Öğrenci ve Puan listesi oluşturulacak.
        *  2. Bu listeler üzerinden bazı istatistikler (ortalama, en yüksek ve en düşük) gösterilecek.
        *  3. Çıkış yapılacak.
        * */

        List<Ogrenci> ogrenciler = null;
        showMenu(ogrenciler);


    }

    private static void showMenu(List<Ogrenci> ogrenciler) {

        String secim;
        do {
            System.out.println("Lütfen seçiminizi yapın:");
            System.out.println("1. öğrenci listesi oluştur");
            System.out.println("2. istatistikleri göster  ");
            System.out.println("3. çıkış yap");
            secim = scanner.next();
            switch (secim){
                case "1":
                    /*
                     Kullanıcıya, sınıf mevcudu sorulur. Verilen yanıta göre, bir döngü aracılığı ile Öğrenci nesnesinden oluşan bir
                     koleksiyon oluşturulur.
                    * */
                   ogrenciler = ogrenciListesiOlustur();
                    break;
                case "2":
                    istatistikleriGoster(ogrenciler);


                    break;
                case "3":
                    System.out.println("Çıkış yapılıyor");
                    break;
                default:
                    System.out.println("Böyle bir seçenek yok!");
                    break;
            }
        }while (!secim.equals("3"));
    }

    private static void istatistikleriGoster(List<Ogrenci> ogrenciler) {
        if (ogrenciler == null) {
            System.out.println("Henüz öğrenci listesi yok! Önce menüden seçerek örenci ekleyin!");
            return;
        }
        //1. Önce tablo olsun:
        tabloOlustur(ogrenciler);

        Ogrenci enDusuk = enDusukPuanliOgrenci(ogrenciler);
        Ogrenci enYuksek = enYuksekPuanliOgrenci(ogrenciler);
        double ortalamaPuan = notOrtalamasi(ogrenciler);
        System.out.printf("En yüksek puanlı öğrenci, %d ile %s%n",enYuksek.puan, enYuksek.ad);
        System.out.printf("En düşük puanlı öğrenci, %d ile %s%n",enDusuk.puan, enDusuk.ad);
        System.out.println("Ortalama: "+ ortalamaPuan);
    }

    private static double notOrtalamasi(List<Ogrenci> ogrenciler){
        int toplamPuan=0;
        for (int i = 0; i < ogrenciler.size() ; i++) {
            toplamPuan += ogrenciler.get(i).puan;
        }
        double ortalamaPuan = toplamPuan / ogrenciler.size();
        return ortalamaPuan;
    }

    private static Ogrenci enYuksekPuanliOgrenci(List<Ogrenci> ogrenciler){

        Ogrenci enYuksek = ogrenciler.get(0);

        for (int i = 0; i < ogrenciler.size() ; i++) {

            if (enYuksek.puan < ogrenciler.get(i).puan){
                enYuksek = ogrenciler.get(i);
            }
        }
        return enYuksek;
    }

    private static  Ogrenci enDusukPuanliOgrenci(List<Ogrenci> ogrenciler){
        Ogrenci enDusuk = ogrenciler.get(0);


        for (int i = 0; i < ogrenciler.size() ; i++) {
            if (enDusuk.puan > ogrenciler.get(i).puan){
                enDusuk = ogrenciler.get(i);
            }
        }
        return enDusuk;
    }

    private static void tabloOlustur(List<Ogrenci> ogrenciler) {
        System.out.println("----------------- Öğrenci Listesi ------------------");
        for (Ogrenci ogrenci : ogrenciler){
            System.out.printf("%-10s -> %10d%n",ogrenci.ad,ogrenci.puan);
        }
        System.out.println("----------------------------------------------------");
    }

    private static List<Ogrenci> ogrenciListesiOlustur(){
        System.out.println("Sınıf kaç kişi?");
        int mevcut = scanner.nextInt();
        List<Ogrenci> ogrenciler = new ArrayList<>();
        for (int i = 0; i < mevcut; i++) {
            scanner = new Scanner(System.in);
            System.out.println((i+1) + ". öğrencinin adı:");
            Ogrenci ogrenci = new Ogrenci();
            ogrenci.ad = scanner.nextLine();
            System.out.println(ogrenci.ad + " isimli öğrencinin puanı:");
            ogrenci.puan = scanner.nextInt();
            ogrenciler.add(ogrenci);
        }

        return ogrenciler;
    }

}