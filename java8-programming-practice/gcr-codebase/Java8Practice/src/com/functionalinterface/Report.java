package com.functionalinterface;

interface ReportExporter {
    void exportCSV();
    void exportPDF();

    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

class SalesReport implements ReportExporter {
    public void exportCSV() {
        System.out.println("Exported CSV");
    }

    public void exportPDF() {
        System.out.println("Exported PDF");
    }
}

public class Report {
    public static void main(String[] args) {

        ReportExporter report = new SalesReport();
        report.exportCSV();
        report.exportPDF();
        report.exportToJSON();
    }
}
