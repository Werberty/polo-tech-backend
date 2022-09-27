import java.util.Arrays;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] frutas_promocao = {"banana", "maçã", "abacaxi", "melão",
            "mamão"};
        System.out.println("Qual a sua lista de compras hoje?");
        String compras = input.nextLine();
        String[] lista_compras = compras.split(",");
        int desconto = 0;
        // System.out.println(Arrays.toString(lista_compras));
        for (String compra : lista_compras){
            for (String promo : frutas_promocao) {
                if (compra.equalsIgnoreCase(promo)) {
                    desconto += 5;
                }
            }
        }
        if (desconto > 0) {
            System.out.println("Você tem direito a um desconto de " + desconto + "%. O mamão está em promoção!");
        } else {
            System.out.println("Nenhum item com promoção.");
        }
    }
}
