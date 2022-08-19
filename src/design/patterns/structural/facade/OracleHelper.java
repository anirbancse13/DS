package design.patterns.structural.facade;

public class OracleHelper implements DbHelper{

    public void generateReport(String format) {
        System.out.println("Generating report in " + format + " format");
    }
}
