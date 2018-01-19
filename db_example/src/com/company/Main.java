package com.company;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ContactDao cd = new ContactDao("jdbc:postgresql://localhost:5432/contact_db",
            "postgres", "Zaq12wsx");
        cd.save("petya', 'deleteeverything'); DELETE FROM contacts; " +
            "INSERT INTO contacts (contact_name, phone)\n" +
            "VALUES ('petya", "81092910101");
        cd.printContacts();
        cd.delete();
        cd.printContacts();
    }
}
