public class Spilklasse {
    private Spiller[] spillere;
    private Spiller harTur;
    private Terning terning;
    private Bræt bræt;
    public Spilklasse(Spiller[] spillere){
        this.spillere = spillere;
        harTur = this.spillere[0];
        bræt = new Bræt();
    }
    public void tag_næste_tur(){
        int flyt = terning.rul();
        harTur.ryk(flyt);
        skift_til_næste_spiller();
    }

    void skift_til_næste_spiller(){
        for(int i = 0; i < spillere.length-1; i++){
            if(spillere[i] == harTur){
                harTur = spillere[i+1];
                return;
            }
            harTur = spillere[0];
        }
    }

}
