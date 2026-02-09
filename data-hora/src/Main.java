import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Terceiro Desafio");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a hora de inicio da Task:");
        int horaInicio = Integer.parseInt(input.nextLine());

        System.out.println("Digite os minutos de inicio da Task:");
        int minutosInicio = Integer.parseInt(input.nextLine());

        System.out.println("Digite a hora de FIM da Task:");
        int horaFim = Integer.parseInt(input.nextLine());

        System.out.println("Digite os minutos de FIM da Task:");
        int minutosFim = Integer.parseInt(input.nextLine());

        LocalTime inicioTask = LocalTime.of(horaInicio,minutosInicio);
        LocalTime fimTask = LocalTime.of(horaFim,minutosFim);

        if(fimTask.isBefore(inicioTask)) {
            System.out.println("Horário de fim não pode ser menor que o início.");
           return;
        }

        Duration duracaoTask = Duration.between(inicioTask,fimTask);

        System.out.println("Início: " + inicioTask);
        System.out.println("Fim: " + fimTask);
        System.out.println("Total: " + duracaoTask.toHours() + " horas e "
                + duracaoTask.toMinutesPart() + " minutos");

    }
}
