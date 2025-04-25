import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int valor1, valor2, prod;

        valor1 = leia.nextInt();

        valor2 = leia.nextInt();

        prod = valor1*valor2;

        System.out.println("PROD = " + prod);

        leia.close();
    }
}
