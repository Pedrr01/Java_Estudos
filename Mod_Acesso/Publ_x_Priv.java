public class Publ_x_Priv {
    
    public static void main(String[] args){

        // Criação dos personagens (Nome Public e Vida Private)
        Personagem luke = new Personagem("Luke", 50);

        //Consigo Acessar e alterar o nome por estar Public.
        luke.nome = "Skaioker";
        System.out.println("Agora só se chama " + luke.nome);

        // Mas não consigo acessar e nem alterar a vida por estar Private.
        // luke.vida = 80
        // System.out.println(luke.vida);
    }


}
