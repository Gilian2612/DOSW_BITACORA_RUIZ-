package E03;

/**
 * FACTORY METHOD
 */
public class ReportFactory {
    /**
     * @param type      Tipo de reporte: "PDF", "EXCEL", "CSV"
     * @param reportName Nombre descriptivo del reporte
     * @return Instancia concreta de ReportGenerator
     * @throws IllegalArgumentException si el tipo no es soportado
     */
    public static ReportGenerator create(String type, String reportName) {
        switch (type.toUpperCase()) {
            case "PDF":
                return new PdfReport(reportName);
            case "EXCEL":
                return new ExcelReport(reportName);
            case "CSV":
                return new CsvReport(reportName);
            default:
                throw new IllegalArgumentException(
                    "Tipo de reporte no soportado: " + type + 
                    ". Tipos válidos: PDF, EXCEL, CSV"
                );
        }
    }
}
