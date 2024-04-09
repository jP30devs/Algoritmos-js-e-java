public class numeroprimo {

    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se for divisível por qualquer número diferente de 1 e ele mesmo, não é primo
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int numero = 19;

        if (Primo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}