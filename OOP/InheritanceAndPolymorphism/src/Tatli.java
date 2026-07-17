public class Tatli extends  Yemek{
    private boolean serbetliMi;

    public boolean serbetliMi() {
        return serbetliMi;
    }

    public void setSerbetliMi(boolean serbetliMi) {
        this.serbetliMi = serbetliMi;
    }

    public Tatli() {
        this.setPismeSuresi(60);
    }

    public void sunumYap(){
        System.out.printf("%s isimli tatlı, yanında dondurmayla sunuldu%n",getAd());
    }
}
