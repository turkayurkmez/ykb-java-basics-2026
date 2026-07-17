public class Main {
    public static void main(String[] args) {
        /*
        Varlıklar:
           1. Aşçı (ad, pisir())
           2. Yemek


        * */
        Asci sef = new Asci();
        sef.setAd("Türkay");

        EtYemek kofte = new EtYemek();
        kofte.setPismeSuresi(30);
        kofte.setAd("İnegöl köfte");

        Tatli tulumba = new Tatli();
        tulumba.setSerbetliMi(true);
        tulumba.setAd("Tulumba tatlısı");

        Corba corba = new Corba();
        corba.setLimonVarMi(true);
        corba.setAd("Mercimek");
        corba.setPismeSuresi(20);

        sef.Pisir(corba);
        sef.Pisir(kofte);
        sef.Pisir(tulumba);

        System.out.println(corba);
        System.out.println(kofte);
        System.out.println(tulumba);


    }
}