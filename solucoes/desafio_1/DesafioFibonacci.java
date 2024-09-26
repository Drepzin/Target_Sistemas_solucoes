package solucoes.desafio_1;

public class DesafioFibonacci {

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
}
