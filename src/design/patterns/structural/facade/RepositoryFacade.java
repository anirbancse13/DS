package design.patterns.structural.facade;

public class RepositoryFacade {
    public void generateReport(String db, String format) {

        DbHelper helper;

        if(db.equals("ORACLE")) {
            helper = new OracleHelper();
        } else {
            helper = new SQLHelper();
        }

        helper.generateReport(format);
    }
}
