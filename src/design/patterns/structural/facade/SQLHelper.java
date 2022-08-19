package design.patterns.structural.facade;

public class SQLHelper implements DbHelper{
    public void generateReport(String format) {
        System.out.println("Generating report in " + format + " format");
    }

}
