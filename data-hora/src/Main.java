import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//DateTimeFormatter templateDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
class Main {
    public static void main(String[] args) {
        System.out.println("Oitavo Desafio");

        ZonedDateTime dataAtualBR = ZonedDateTime.now();
        ZonedDateTime dataAtualToquio =
                dataAtualBR.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatterHora =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Horário atual em Tóquio: " + dataAtualToquio.format(formatterHora));

    }
}
