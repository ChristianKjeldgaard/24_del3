public class Spiller {
    private String name;
    private int age;
    private int money = 35;
    private Felt felt;
    String property;

    public Spiller(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void ryk(int antal_felter){
        if(antal_felter == 0){
            felt.ramt(this);
        }else{
            felt = felt.getNæstefelt();
            ryk(antal_felter-1);
        }
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setPosition(Felt felt) {
        this.felt = felt;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return  money;
    }

    public Felt getPosition(){
        return felt;
    }

    public String getProperty(){
        return property;
    }

    public void updateMoney(int beløb){
        money += beløb;
    }


    public void teleporterTil(Felt felt) {
    }
}