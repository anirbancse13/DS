package design.patterns.structural.facade;

public class GenerateReport {
    public static void main(String[] args) {

        RepositoryFacade repo = new RepositoryFacade();
        repo.generateReport("ORACLE", "PDF");
        repo.generateReport("SQL", "HTML");
    }
}
