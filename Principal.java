public class Principal {
    public static void main(String[] args) {

        Saber w1 = new Saber("Sabre de luz azul");
        Saber w2 = new Saber("Sabre de luz vermelho");
        Blast w3 = new Blast("Blast laser");
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Leia");
        p1.setSobrenome("Organo");
        p1.setSexo("Feminino");

        Pessoa p2 = new Pessoa();
        p2.setNome("Luke");
        p2.setSobrenome("Skywalker");
        p2.setSexo("Masculino");

        Jedi j1 = new Jedi();
        j1.setNome("Obi-Wan Kenobi");
        j1.mindControl();
        j1.levitation();
        w1.pickUp();
        w3.pickUp();
        w3.drop();
        w3.shot();
        


        Sith s1 = new Sith();
        s1.setNome("Darth Vader");
        s1.mindControl();
        s1.levitation(); 
        w2.pickUp();
        w2.slash();
}
}
