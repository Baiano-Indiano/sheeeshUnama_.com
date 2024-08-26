import java.util.Scanner;

public class Bagui {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = leitura.nextInt();
        
        // Loop to print the pattern
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        leitura.close(); // It's good practice to close the scanner
    }
}
