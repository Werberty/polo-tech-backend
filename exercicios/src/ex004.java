import java.util.Arrays;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] frutas_promocao = {"banana", "maçã", "abacaxi", "melão",
            "mamão"};
        System.out.println("Qual fruta você deseja comprar hoje?");
        String fruta = input.nextLine();
        if (Arrays.asList(frutas_promocao).contains(fruta)) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        }
    }
}
