import java.util.function.DoubleFunction;

public class ex1 {

    static double maior(int a, int b, int c, int d) {
        int vet[] = new int[4];

        vet[0] = a;
        vet[1] = b;
        vet[2] = c;
        vet[3] = d;

        int aux = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > aux) {
                aux = vet[i];
            }
        }

        return (double) aux;
    }

    public static void main(String[] args) {
        double n = maior(4, 3, 2, 1);
        System.out.printf("%.1f", n);
    }
}