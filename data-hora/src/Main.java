import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//DateTimeFormatter templateDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
class Main {
    public static void main(String[] args) {
        System.out.println("Sexto Desafio");

        LocalDate dataEvento = LocalDate.of(2026,3,1);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter templateDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data do evento: " + dataEvento.format(templateDateBR));
        System.out.println("Data atual: " + dataAtual.format(templateDateBR));

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("O evento já ocorreu");
        } else if (dataEvento.isAfter(dataAtual)) {
            System.out.println("O evento ainda está por vir");
        } else {
            System.out.println("O evento está acontecendo hoje");
        }


    }
}
