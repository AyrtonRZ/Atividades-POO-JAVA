import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciação");
        System.out.println("6 - Raiz Quadrada");
        System.out.println("7 - Raiz Cúbica");
        System.out.println("8 - Todas as operações");

        int operacao = scanner.nextInt();

        switch(operacao) {
            case 1:
                System.out.print("Digite outro número: ");
                double numero2 = scanner.nextDouble();
                System.out.println(numero + " + " + numero2 + " = " + (numero + numero2));
                break;
            case 2:
                System.out.print("Digite outro número: ");
                double numero3 = scanner.nextDouble();
                System.out.println(numero + " - " + numero3 + " = " + (numero - numero3));
                break;
            case 3:
                System.out.print("Digite outro número: ");
                double numero4 = scanner.nextDouble();
                System.out.println(numero + " x " + numero4 + " = " + (numero * numero4));
                break;
            case 4:
                System.out.print("Digite outro número: ");
                double numero5 = scanner.nextDouble();
                if (numero5 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    System.out.println(numero + " / " + numero5 + " = " + (numero / numero5));
                }
                break;
            case 5:
                System.out.print("Digite o expoente: ");
                int expoente = scanner.nextInt();
                System.out.println(numero + " elevado a " + expoente + " = " + Math.pow(numero, expoente));
                break;
            case 6:
                System.out.println("A raiz quadrada de " + numero + " = " + Math.sqrt(numero));
                break;
            case 7:
                System.out.println("A raiz cúbica de " + numero + " = " + Math.cbrt(numero));
                break;
            case 8:
                System.out.print("Digite outro número: ");
                double numero6 = scanner.nextDouble();
                System.out.println(numero + " + " + numero6 + " = " + (numero + numero6));
                System.out.println(numero + " - " + numero6 + " = " + (numero - numero6));
                System.out.println(numero + " x " + numero6 + " = " + (numero * numero6));
                if (numero6 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    System.out.println(numero + " / " + numero6 + " = " + (numero / numero6));
                }
                System.out.println(numero + " elevado a 2 = " + Math.pow(numero, 2));
                System.out.println("A raiz quadrada de " + numero + " = " + Math.sqrt(numero));
                System.out.println("A raiz cúbica de " + numero + " = " + Math.cbrt(numero));
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        scanner.close();
    }
}