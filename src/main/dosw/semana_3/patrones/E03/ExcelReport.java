package E03;

/**
 * Implementación concreta del Template Method para reportes Excel.
 * Solo implementa los pasos variables: applyFormat() y exportFile().
 */
public class ExcelReport extends ReportGenerator {

    public ExcelReport(String reportName) {
        super(reportName);
    }

    @Override
    protected String applyFormat() {
        return "Formato Excel aplicado: hoja 'Resumen' con gráficos, hoja 'Datos' con filtros automáticos, colores alternados.";
    }

    @Override
    protected String exportFile() {
        String fileName = getReportName().replaceAll("\\s+", "_") + ".xlsx";
        return "Archivo exportado: " + fileName + " (3 hojas, 150 filas)";
    }
}
