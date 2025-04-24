/*
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 * 
 * ENTRADA: A entrada contém 2 valores inteiros.
 * 
 * SAIDA: Imprima a mensagem "X = " (letra X maiúscula) seguindo pelo valor da variável X e pelo final de linha. Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.
 */

import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a = leia.nextInt();
        int b = leia.nextInt();

        int soma = a + b;

        System.out.println("X = " + soma);
        leia.close();
    } 
}
