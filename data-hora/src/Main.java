import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//DateTimeFormatter templateDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
class Main {
    public static void main(String[] args) {
        System.out.println("Sétimo Desafio");

        LocalDate dataVencimento = LocalDate.of(2025, 3, 30);
        Period antecedencia = Period.ofDays(20);

        LocalDate dataLembrete = dataVencimento.minus(antecedencia);

        DateTimeFormatter templateDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de vencimento: " + dataVencimento.format(templateDateBR));
        System.out.println("Antecedência: " + antecedencia.getDays() + " dias");
        System.out.println("Data do lembrete: " + dataLembrete.format(templateDateBR));


    }
}
