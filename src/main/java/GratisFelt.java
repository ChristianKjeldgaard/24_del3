public class GratisFelt extends Chancekort {

    private Felt felt;

    public GratisFelt(String iden, Felt felt) {
        super(iden);
        this.felt=felt;
    }

    @Override
    void brug(Spiller s) {
        while(!s.getFelt().getFeltfarve().equals(felt)) {
            s.ryk(1);
        }

        if (s.getFelt().getEjer() != null){
            s.betal(-felt.getPris());
            s.getFelt().getEjer().betal(felt.getPris());
        }else{
            s.getFelt().setEjer(s);
        }
/*

        - GRATIS FELT: Ryk frem til et rødt felt. Hvis ingen ejer den får du den gratis ellers
        skal du betale leje til ejeren.
        - GRATIS FELT: Ryk frem til et lyseblåt felt. Hvis ingen ejer den får du den gratis ellers
        skal du betale leje til ejeren.
        - GRATIS FELT: Ryk frem til et orange felt. Hvis ingen ejer den får du den gratis ellers
        skal du betale leje til ejeren.
        */
    }
}
