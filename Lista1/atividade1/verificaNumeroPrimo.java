import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero para verificar se e primo: ");
        int numero = scanner.nextInt();
        
        if (ehPrimo(numero)) {
            System.out.println(numero + " e um numero primo.");
        } else {
            System.out.println(numero + " nao e um numero primo.");
        }
        
        scanner.close();
    }
}
