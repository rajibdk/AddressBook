package tutorial.adressbook.spring;

import tutorial.adressbook.entity.Contact;
import tutorial.adressbook.jdbc.JDBCService;

import java.sql.SQLException;

public class PostgresqlRepo {

    private JDBCService service;

    public void addContact(Contact contact) throws SQLException {
        service.createConnection("","","");
        service.executeQueries("");
    }

    public void setService(JDBCService service) {
        this.service = service;
    }
}
