import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit:");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius*1.8) + 32;
        System.out.println("O equivalente a " + celsius + " C é " + fahrenheit + " F.");
    }
}
