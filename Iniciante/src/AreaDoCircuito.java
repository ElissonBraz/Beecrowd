/*
 * A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

ENTRADA: A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

SAÍDA: Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCircuito {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in).useLocale(Locale.US);

        float n = 3.14159f;

        float raio = leia.nextFloat();

        float area = (float) (n * Math.pow(raio, 2));

        System.out.printf("A=%.4f" , area);


        leia.close();
    }
}
