import java.util.Scanner;

public class Atividade02 {
    public static void conversorTemperatura(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        double temperaturaKelvin = temperaturaCelsius + 273.15;

        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
        System.out.println("Temperatura em Kelvin: " + temperaturaKelvin);

        scanner.close();
    }
}

