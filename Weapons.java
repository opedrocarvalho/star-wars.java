public class Weapons {
    private String descrição;
    private String dano;

    public Weapons (String descrição){
        this.descrição=descrição;
    }

    public void drop(){
    
    }

    public void pickUp(){
        System.out.println(getDescrição());
    }


    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }


    public String getDano() {
        return dano;
    }
    public void setDano(String dano) {
        this.dano = dano;
    }

}
