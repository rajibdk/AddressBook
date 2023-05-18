package tutorial.adressbook.spring;

import tutorial.adressbook.jdbc.JDBCService;

public class MainApp {
    public static void main(String[] args) {
        JDBCService service = new JDBCService();
        PostgresqlRepo postgresqlRepo = new PostgresqlRepo();
        postgresqlRepo.setService(service);
    }
}
