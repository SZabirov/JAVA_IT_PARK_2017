import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Реализация интерфейса ContactDao
 */
public class ContactDaoImplementation implements ContactDao {
  Connection connection;

  public ContactDaoImplementation() throws ClassNotFoundException, SQLException {
    Class.forName("org.postgresql.Driver");
    connection = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/contact_db",
        "postgres",
        "Zaq12wsx");
  }

  @Override
  public void save(Contact contact) throws SQLException {
    String name = contact.getName();
    String phone = contact.getPhone();

    PreparedStatement pstmt = connection.prepareStatement(
        "INSERT INTO contacts (contact_name, phone) VALUES (?, ?);");
    pstmt.setString(1, name);
    pstmt.setString(2, phone);
    pstmt.executeUpdate();
  }

  @Override
  public List<Contact> getAllContacts() throws SQLException {
    List<Contact> list = new ArrayList<>();
    PreparedStatement pstmt =
        connection.prepareStatement("SELECT id, contact_name, phone FROM contacts");
    ResultSet rs = pstmt.executeQuery();
    while (rs.next()) {
      int id = rs.getInt("id");
      String name = rs.getString("contact_name");
      String phone = rs.getString("phone");
      Contact contact = new Contact(id, name, phone);
      list.add(contact);
    }
    return list;
  }
}






