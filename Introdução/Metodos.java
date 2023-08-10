public class Metodos{

    public static void main(String[] args){

        Nome("Pedro Vitor");
        
        int valor = Somar(5, 9);
        System.out.println("O valor da soma entre 5 + 9 é igual a: " + valor);

        

    }

    //Mod. de Acesso + retorno + nome + conjunto de parametros

    // VOID -> não retorna nenhum valor, apenas a impressão ou nem isso.
    public static void Nome(String n){

        System.out.println("Olá " + n + " é uma prazer conhecê-lo.");
    }

    // INT -> Exemplo de uma das opções de retorno com valor, sempre utilizar o RETURN
    public static int Somar(int x, int y){
        int res = x + y;
        return res;
    }
}