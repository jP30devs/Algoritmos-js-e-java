import java.util.Arrays;

public class ordenacao {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 3, 2, 2, 7, 9, 1};
        
        Arrays.sort(numeros);
        System.out.println("Ordenação crescente: " + Arrays.toString(numeros));
        
        Arrays.sort(numeros);
        System.out.print("Ordenação decrescente: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}