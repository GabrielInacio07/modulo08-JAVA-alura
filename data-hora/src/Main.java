import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Segundo Desafio (Já havia feito no primeiro) ");
        Scanner input = new Scanner(System.in);

        LocalDate dateAtual = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");


        System.out.println("Digite um Pedido");
        String tarefa = input.nextLine();

        System.out.println("Tarefa cadastrada: " + tarefa);
        System.out.println("Data do registro: " + dateAtual.format(dataFormatada));
        System.out.println("Hora do registro: " + hora.format(horaFormatada));
    }
}
