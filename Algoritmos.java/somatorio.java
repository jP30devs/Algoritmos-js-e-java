public class somatorio {
    public static int calcularSomatorio(int[] array) {
        int somatorio = 0;
        for (int i = 0; i < array.length; i++) {
            somatorio += array[i];
        }
        return somatorio;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 6, 7, 8, 9};
        int resultado = calcularSomatorio(numeros);
        System.out.println("O somatório dos números é: " + resultado);
    }
}