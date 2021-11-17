public class Chancekortfortolker {

    public void brugKort(Spiller s, Chancekort kort){

        if(kort.getClass() == chance.RykKort.class){
            int ønsket_ryk;
            /*spørg ejer hvor mange felter han vil rykke (gui);*/
            ((chance.RykKort) kort).setØnsket_ryk(ønsket_ryk);
            kort.brug(s);
        }
        if(kort.getClass() == RykTilKort.class){
            kort.brug(s);
        }
        if(kort.getClass() == BetalKort.class){
            kort.brug(s);
        }
        if(kort.getClass() == chance.GratisFelt.class){
            kort.brug(s);
        }
        if (kort.getClass() == FængselKort.class){
            kort.brug(s);
        }
    }
}
