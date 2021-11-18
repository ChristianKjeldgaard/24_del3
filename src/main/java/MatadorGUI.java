import gui_fields.*;
import gui_main.GUI;

import java.util.HashMap;
import java.util.Map;

public class MatadorGUI {
    Map<Felt, GUI_Field> felterIGUI;
    GUI gui;
    Spilklasse spilklasse;
    public MatadorGUI(Spilklasse spilklasse)
    {
        this.spilklasse = spilklasse;
        gui = new GUI();
    }

    private void link_felter(){
        felterIGUI = new HashMap<Felt, GUI_Field>();
        Felt[] felter = spilklasse.getBræt().getFelts();
        felterIGUI.put(felter[0], new GUI_Start());
        GUI_Street felt = new GUI_Street();
        felt.setTitle(felter[1].navn);
        String pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[1], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[2].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[2], felt);

        GUI_Chance chanceFelt = new GUI_Chance();
        chanceFelt.setTitle(felter[3].navn);
        felterIGUI.put(felter[3], chanceFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[4].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[4], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[5].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[5], felt);

        GUI_Empty besøgfængselFelt = new GUI_Empty();
        besøgfængselFelt.setTitle(felter[6].navn);
        felterIGUI.put(felter[6],besøgfængselFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[7].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[7], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[8].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[8], felt);

        chanceFelt = new GUI_Chance();
        chanceFelt.setTitle(felter[9].navn);
        felterIGUI.put(felter[9], chanceFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[10].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[10], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[11].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[11], felt);

        GUI_Empty gratisparkeringFelt = new GUI_Empty();
        gratisparkeringFelt.setTitle(felter[6].navn);
        felterIGUI.put(felter[6],gratisparkeringFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[13].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[13], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[14].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[14], felt);

        chanceFelt = new GUI_Chance();
        chanceFelt.setTitle(felter[15].navn);
        felterIGUI.put(felter[15], chanceFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[16].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[16], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[17].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[17], felt);

        GUI_Jail fængselFelt = new GUI_Jail();
        fængselFelt.setTitle(felter[18].navn);
        felterIGUI.put(felter[18],fængselFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[19].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[19], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[20].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[20], felt);

        chanceFelt = new GUI_Chance();
        chanceFelt.setTitle(felter[21].navn);
        felterIGUI.put(felter[21], chanceFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[22].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[22], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[23].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[23], felt);


    }
}
