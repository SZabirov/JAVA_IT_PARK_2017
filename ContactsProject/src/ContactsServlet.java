import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Реализация сервлета (принимает запрос, возвращает ответ)
 * Следует переопределить два метода: doGet(), doPost() - в чем разница? google it
 */
public class ContactsServlet extends HttpServlet {
  ContactDao contactDao = new ContactDaoImplementation();

  public ContactsServlet() throws SQLException, ClassNotFoundException {
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<Contact> list = null;
    try {
      list = contactDao.getAllContacts();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    req.setAttribute("list", list);
    req.getRequestDispatcher("/contacts.ftl").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String name = req.getParameter("name");
    String phone = req.getParameter("phone");
    String idToDelete = req.getParameter("id");
    if (name == null & phone == null) {
      //логика для удаления
    } else {
      Contact contact = new Contact(name, phone);
      contact.setName(name);
      contact.setPhone(phone);
      try {
        contactDao.save(contact);
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    doGet(req, resp);
  }
}
