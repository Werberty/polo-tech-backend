import java.util.Arrays;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a sua lista de compras:");
        String[] carrinho = new String[5];
        for (int i = 0; i < carrinho.length; i++) {
            carrinho[i] = input.nextLine();
        }
        System.out.println("As frutas no seu carrinho são:");
        // System.out.println(carrinho[0] + ", " + carrinho[1] + ", " + carrinho[2] + ", " + carrinho[3] + ", " + carrinho[4]);
        System.out.println(Arrays.toString(carrinho));
    }
}
