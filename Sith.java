public class Sith implements Force{
    private String nome;
    private String titulo;
    private String weapons;

    public Sith(){
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getWeapons() {
        return weapons;
    }
    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    @Override
    public void mindControl() {
        
    }

    @Override
    public void farseeing() {
        
    }

    @Override
    public void telepathy() {
        
    }

    @Override
    public void levitation() {
        System.out.println ("Levitating Something!");
    }

}
