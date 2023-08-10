public class MatrizPronta {
    
    public static void main(String[] args){

        int[][] matriz = {{10,58,1},{14,56,80},{73,20,6}};

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
