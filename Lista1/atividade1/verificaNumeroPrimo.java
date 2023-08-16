import java.util.Scanner;

public class VerificadorPrimo {
    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; // Não é primo
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; // Não é primo
            }
        }
        
        return 1; // É primo
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero para verificar se e primo: ");
        int numero = scanner.nextInt();
        
        int resultado = verificaNumeroPrimo(numero);
        
        if (resultado == 1) {
            System.out.println(numero + " e um numero primo.");
        } else {
            System.out.println(numero + " nao e um numero primo.");
        }
        
        scanner.close();
    }
}
