import java.util.List;

public class Yemek  {

    private String ad;
    private double fiyat;

    private List<String> malzemeler;

    private int pismeSuresi;


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public List<String> getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(List<String> malzemeler) {
        this.malzemeler = malzemeler;
    }

    public int getPismeSuresi() {
        return pismeSuresi;
    }

    public void setPismeSuresi(int pismeSuresi) {
        this.pismeSuresi = pismeSuresi;
    }

    public void hazirla(){
        System.out.printf("%s isimli ürün, %d dakikada hazırlandı%n",ad,pismeSuresi);
    }

    public void sunumYap(){
        System.out.printf("%s isimli yemek, yanında pilav sunuldu%n",ad);
    }

    @Override
    public String toString()
    {
        return String.format("Yemek adı: %s, pişme süresi: %d",ad,pismeSuresi);
    }



}
