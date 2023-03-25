import java.util.Scanner;

public class ex3 {

    static void printDiagonalPrincipal(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; i < mat.length; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        int matriz[][] = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        printDiagonalPrincipal(matriz);
    }
}
