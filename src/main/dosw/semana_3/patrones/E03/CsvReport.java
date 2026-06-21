package E03;

/**
 * Implementación concreta del Template Method para reportes CSV.
 * Solo implementa los pasos variables: applyFormat() y exportFile().
 */
public class CsvReport extends ReportGenerator {

    public CsvReport(String reportName) {
        super(reportName);
    }

    @Override
    protected String applyFormat() {
        return "Formato CSV aplicado: separador ';', encoding UTF-8, headers en primera fila, sin estilos.";
    }

    @Override
    protected String exportFile() {
        String fileName = getReportName().replaceAll("\\s+", "_") + ".csv";
        return "Archivo exportado: " + fileName + " (150 filas, 45 KB)";
    }
}
