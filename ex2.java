public class ex2 {

    static int procuraMaiorValor(int a[]) {

        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > aux) {
                aux = a[i];
            }
        }

        return aux;
    }

    public static void main(String[] args) {
        int vetor[] = { 1, -2, 3, 4, -5, 6, -7 };
        int maior = procuraMaiorValor(vetor);
        System.out.println(maior);
    }
}
