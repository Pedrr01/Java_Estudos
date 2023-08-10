import java.security.SecureRandom;

public class MatrizConstru {
    
    public static void main(String[] args){

        //Inicio criando duas constantes, uma para as linhas e outra para as colunas.
        final int linhas = 3;
        final int colunas = 4;

        //Crio um array dentro de outro array e em seguida passo os a quantidade:
        //[ [linhas], [linhas], [linhas] ] e quantos elementos vão conter nas linhas.
        int[][] matriz = new int[linhas][colunas];

        //Colocar números dentro da matriz de forma aleatoria:
        //
        for(int x = 0; x < linhas; x++){
            for(int y = 0; y < colunas; y++){
                matriz[x][y] = new SecureRandom().nextInt(100);
            }
        }

        //Para imprimir a matriz irei usar o for de array mas posso usar o normal:
        for(int[] x : matriz){
            for(int y : x){
                System.out.printf("%2d | ", y);
            }
            //Pular depois de inserir uma linha.
            System.out.println();
        }
    }
}


