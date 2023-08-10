public class Personagem {

    //Public -> Consigo acessar e alterar os dados no arquivo Principal.
    //Private -> Consigo acessar e alterar os dados apenas na Classe de criação.
    
    public String nome = "";
    private int vida = 0;

    public Personagem(String nome,int vida){

        //O this faz a refencia para o elemento da classe.
        this.vida = vida;
        System.out.println("Nome:" + nome + ", com vida igual a: " + vida);
    }
}
