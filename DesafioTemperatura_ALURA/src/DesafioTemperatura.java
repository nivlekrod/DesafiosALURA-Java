import java.util.Locale;
import java.util.Scanner;

public class DesafioTemperatura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temperaturaEmCelsius = sc.nextDouble();
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        System.out.printf("A temperatura de %f Celsius é equivalente a %f Fahrenheit\n", temperaturaEmCelsius, temperaturaEmFahrenheit);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

        sc.close();
    }

}