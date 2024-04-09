public class mdc {
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        int numero1 = 18;
        int numero2 = 26;
        int resultado = calcularMDC(numero1, numero2);
        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é: " + resultado);
    }
}
