public class contagem {
    public static int contarInteiros(int primeiro, int ultimo) {
        int contador = 0;
        
        for (int i = primeiro; i <= ultimo; i++) {
            if (ehInteiro(i)) {
                contador++;
            }
        }
        
        return contador;
    }
    
    public static boolean ehInteiro(int numero) {
        return numero % 1 == 0;
    }

    public static void main(String[] args) {
        int primeiro = 3;
        int ultimo = 10;
        int quantidade = contarInteiros(primeiro, ultimo);
        System.out.println("Quantidade de valores inteiros entre " + primeiro + " e " + ultimo + ": " + quantidade);
    }
}
