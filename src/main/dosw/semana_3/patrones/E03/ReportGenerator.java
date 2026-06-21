package E03;

/**
 * TEMPLATE METHOD PATTERN
 * Define la estructura fija del algoritmo de generación de reportes.
 * El método generate() es final (no se puede sobreescribir) y ejecuta
 * los 4 pasos en orden. Las subclases solo implementan los pasos variables:
 * applyFormat() y exportFile().
 */
public abstract class ReportGenerator {

    private String reportName;

    public ReportGenerator(String reportName) {
        this.reportName = reportName;
    }
    public final String generate() {
        StringBuilder log = new StringBuilder();
        log.append("=== Generando reporte: ").append(reportName).append(" ===\n");
        
        String data = fetchData();
        log.append("[Paso 1] ").append(data).append("\n");
        
        String processed = processData();
        log.append("[Paso 2] ").append(processed).append("\n");
        
        String formatted = applyFormat();
        log.append("[Paso 3] ").append(formatted).append("\n");
        
        String exported = exportFile();
        log.append("[Paso 4] ").append(exported).append("\n");
        
        log.append("=== Reporte ").append(reportName).append(" completado ===\n");
        return log.toString();
    }
    protected String fetchData() {
        return "Datos obtenidos de la base de datos (ventas Q2 2026).";
    }
    protected String processData() {
        return "Datos procesados: 150 registros filtrados, 12 categorías agrupadas.";
    }
    protected abstract String applyFormat();
    protected abstract String exportFile();
    public String getReportName() {
        return reportName;
    }
}
