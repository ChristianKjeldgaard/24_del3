public class RykTilKort extends chance.Chancekort {

    private Felt felt;

    public RykTilKort(String iden, Felt felt) {
        super(iden);
        this.felt = felt;
    }

    @Override
    public void brug(Spiller s) {
        s.teleporterTil(felt);
    }

}
