package E03;

public class Main {
    public static void main(String[] args) {
        System.out.println("  E03 Sistema de Reportes Empresariales");
        System.out.println("   Patrones: Template Method + Factory Method");
        String[] tipos = {"PDF", "EXCEL", "CSV"};

        for (String tipo : tipos) {
            ReportGenerator report = ReportFactory.create(tipo, "Ventas Q2 2026");
            System.out.println(report.generate());
        }

        System.out.println(" Simulación: usuario solicita reporte dinámicamente \n");
        ReportGenerator reporteUsuario = ReportFactory.create("EXCEL", "Inventario Mensual");
        System.out.println(reporteUsuario.generate());

        System.out.println("Simulación: tipo de reporte no válido \n");
        try {
            ReportFactory.create("HTML", "Test").generate();
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR capturado: " + e.getMessage());
            System.out.println("El Factory lanza excepción para tipos no soportados.\n");
        }
        System.out.println("         RESUMEN DE INTERACCIÓN                                 ║");
        System.out.println("  1. Cliente pide tipo -> Factory.create(tipo)            ");
        System.out.println("  2. Factory retorna instancia concreta (PdfReport, etc) ");
        System.out.println("  3. Cliente llama report.generate()                     ");
        System.out.println("  4. Template Method ejecuta los 4 pasos en orden        ");
        System.out.println("  5. Pasos fijos son iguales, variables dependen del tipo");
    }
}
