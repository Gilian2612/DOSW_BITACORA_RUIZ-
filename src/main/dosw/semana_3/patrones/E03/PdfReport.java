package E03;

/**
 * Implementación concreta del Template Method para reportes PDF.
 * Solo implementa los pasos variables: applyFormat() y exportFile().
 */
public class PdfReport extends ReportGenerator {

    public PdfReport(String reportName) {
        super(reportName);
    }

    @Override
    protected String applyFormat() {
        return "Formato PDF aplicado: márgenes A4, encabezado con logo, tabla con bordes, pie de página con número.";
    }

    @Override
    protected String exportFile() {
        String fileName = getReportName().replaceAll("\\s+", "_") + ".pdf";
        return "Archivo exportado: " + fileName + " (tamaño estimado: 2.4 MB)";
    }
}
