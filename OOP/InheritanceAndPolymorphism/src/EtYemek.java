public class EtYemek extends Yemek {

    private PismeDerecesi pismeDerecesi;

    public PismeDerecesi getPismeDerecesi() {
        return pismeDerecesi;
    }

    public void setPismeDerecesi(PismeDerecesi pismeDerecesi) {
        this.pismeDerecesi = pismeDerecesi;
    }

    public EtYemek() {
        this.pismeDerecesi = PismeDerecesi.Orta;
    }
}
