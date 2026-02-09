import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Quarto Desafio");

        LocalDate dataInicio = LocalDate.of(2026,3,1);
        LocalDate prazoEntrega = dataInicio.plusDays(60);

        DateTimeFormatter templateDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de inicio do Projeto: " + dataInicio.format(templateDateBR));
        System.out.println("Prazo de entrega: " + prazoEntrega.format(templateDateBR));


    }
}
