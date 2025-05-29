import java.util.Scanner;

public class TempoDeJogoEmMinutos {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal;

        horaInicial = leia.nextInt();
        minutoInicial = leia.nextInt();
        horaFinal = leia.nextInt();
        minutoFinal = leia.nextInt();

        leia.close();

        int inicioEmMinutos = (horaInicial * 60) + minutoInicial;
        int fimEmMinutos = (horaFinal * 60) + minutoFinal;

        if (fimEmMinutos <= inicioEmMinutos) {
            fimEmMinutos += 24 * 60; // Ajuste para Jogos que ultrapassam a meia-noite.
        }

        int duracaoTotal = fimEmMinutos - inicioEmMinutos;
        int horas = duracaoTotal / 60;
        int minutos = duracaoTotal % 60;
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horas, minutos);
    }
}
