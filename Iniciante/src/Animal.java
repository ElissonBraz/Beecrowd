
import java.util.Scanner;
/*
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  
 * Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
 * 
 * Entrada:
 * A entrada contém 3 palavras, uma em cada linha, 
 * necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.
 */
public class Animal {
    public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);

         String classificacao, tipo, alimentacao;

         classificacao = leia.nextLine();
         tipo = leia.nextLine();
         alimentacao = leia.nextLine();

         if (classificacao.equalsIgnoreCase("vertebrado") && tipo.equalsIgnoreCase("ave") && alimentacao.equalsIgnoreCase("carnivoro")) {
            System.out.println("aguia");
         } else if (classificacao.equalsIgnoreCase("vertebrado") && tipo.equalsIgnoreCase("ave") && alimentacao.equalsIgnoreCase("onivoro")) {
            System.out.println("pomba");
         } else if (classificacao.equalsIgnoreCase("vertebrado") && tipo.equalsIgnoreCase("mamifero") && alimentacao.equalsIgnoreCase("onivoro")) {
            System.out.println("homem");
         } else if (classificacao.equalsIgnoreCase("vertebrado") && tipo.equalsIgnoreCase("mamifero") && alimentacao.equalsIgnoreCase("herbivoro")) {
            System.out.println("vaca");
         } else if (classificacao.equalsIgnoreCase("invertebrado") && tipo.equalsIgnoreCase("inseto") && alimentacao.equalsIgnoreCase("hematofago")) {
            System.out.println("pulga");
         } else if (classificacao.equalsIgnoreCase("invertebrado") && tipo.equalsIgnoreCase("inseto") && alimentacao.equalsIgnoreCase("herbivoro")) {
            System.out.println("lagarta");
         } else if (classificacao.equalsIgnoreCase("invertebrado") && tipo.equalsIgnoreCase("anelideo") && alimentacao.equalsIgnoreCase("hematofago")) {
            System.out.println("sanguessuga");
         } else if (classificacao.equalsIgnoreCase("invertebrado") && tipo.equalsIgnoreCase("anelideo") && alimentacao.equalsIgnoreCase("onivoro")) {
            System.out.println("minhoca");
         }

         leia.close();
    }
}
