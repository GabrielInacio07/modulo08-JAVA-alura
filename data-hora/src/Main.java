import java.time.*;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("📅 MANIPULAÇÃO DE DATA E HORA - JAVA");
        System.out.println("=================================\n");

        // DATA ATUAL
        LocalDate dataCompra = LocalDate.now();

        // DATA CONFIGURADA
        LocalDate firstParcela = LocalDate.of(2026, 2, 8);

        // DATA POSTERIOR
        LocalDate secondParcela = firstParcela.plusDays(30);

        System.out.println("🔹 DATAS");
        System.out.println("Data da compra (NOW): " + dataCompra);
        System.out.println("Primeira parcela (OF): " + firstParcela);
        System.out.println("Segunda parcela (+30 dias): " + secondParcela);

        // COMPARAÇÃO DE DATAS
        System.out.println("\n🔹 STATUS DO PAGAMENTO");

        if (firstParcela.isAfter(dataCompra)) {
            System.out.println("➡️ Pagamento parcelado (data futura)");
        } else if (firstParcela.isBefore(dataCompra)) {
            System.out.println("⚠️ Pagamento antecipado");
        } else {
            System.out.println("✅ Pagamento à vista");
        }

        // FORMATADOR DE DATA
        DateTimeFormatter templateDataBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("\n🔹 DATA FORMATADA (BR)");
        System.out.println("Data atual formatada: " + dataCompra.format(templateDataBR));

        // FUSO HORÁRIO
        ZonedDateTime dataFusoBR = ZonedDateTime.now();
        ZonedDateTime dataFusoUSA = dataFusoBR.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("\n🌎 FUSO HORÁRIO");
        System.out.println("Brasil: " + dataFusoBR);
        System.out.println("EUA (New York): " + dataFusoUSA);

        // DURAÇÃO DE HORÁRIO
        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("\n⏱️ DURAÇÃO DO EXPEDIENTE");
        System.out.println("Início: " + inicio);
        System.out.println("Fim: " + fim);
        System.out.println("Total: " + duracao.toHours() + " horas e "
                + duracao.toMinutesPart() + " minutos");

        // PERÍODO ENTRE DATAS
        LocalDate dataPagamento = LocalDate.parse("2026-05-10");
        Period periodo = Period.between(dataCompra, dataPagamento);

        System.out.println("\n📆 DIFERENÇA ENTRE DATAS");
        System.out.println("Diferença: "
                + periodo.getYears() + " anos, "
                + periodo.getMonths() + " meses e "
                + periodo.getDays() + " dias");

        System.out.println("\n=================================");
        System.out.println("🚀 FIM DA EXECUÇÃO");
        System.out.println("=================================");
    }
}
