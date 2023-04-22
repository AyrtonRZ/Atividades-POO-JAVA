import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de raiz cúbica ou raiz quadrada.");
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            double raizCubica = Math.cbrt(numero);
            System.out.println("Raiz cúbica de " + numero + ": " + raizCubica);
        } else {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("Raiz quadrada de " + numero + ": " + raizQuadrada);
        }

        scanner.close();
    }
}
