import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a, b, soma;

        a = leia.nextInt();
        b = leia.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);


        leia.close();
    }
}
