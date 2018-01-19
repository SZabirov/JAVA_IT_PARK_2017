package com.company;

import java.sql.*;

public class ContactDao {
  Connection connection;

  public ContactDao(String url, String username, String password) throws ClassNotFoundException, SQLException {
    Class.forName("org.postgresql.Driver");
    connection = DriverManager.getConnection(
            url,
            username,
            password);
  }

  void delete() {

  }

  void save(String name, String phone) throws SQLException {
    PreparedStatement pstmt = connection.prepareStatement(
            "INSERT INTO contacts (contact_name, phone) VALUES (?, ?);");
    pstmt.setString(1, name);
    pstmt.setString(2, phone);
    pstmt.executeUpdate();
    //неправильно
//    Statement statement = connection.createStatement();
//    String sql_query = "INSERT INTO contacts (contact_name, phone) " +
//        "VALUES ('" + name + "', " + phone + ")";
//    System.out.println(sql_query);
//    statement.executeUpdate(sql_query);
  }

  void printContacts() throws SQLException {
    Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery("SELECT * FROM contacts");
    while (rs.next()) {
      int id = rs.getInt("id");
      String name = rs.getString("contact_name");
      String phone = rs.getString("phone");
      System.out.print(id + " | ");
      System.out.print(name + " | ");
      System.out.print(phone + " | ");
      System.out.println();
    }
    connection.close();
  }
}
