import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Реализация сервлета (принимает запрос, возвращает ответ)
 * Следует переопределить два метода: doGet(), doPost() - в чем разница? google it
 */
public class ContactsServlet extends HttpServlet {
  ContactDao contactDao = new ContactDaoImplementation();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<Contact> list = contactDao.getAllContacts();
    req.setAttribute("list", list);
    req.getRequestDispatcher("/contacts.ftl").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String imya = req.getParameter("name");
    String telephon = req.getParameter("phone");
    Contact contact = new Contact();
    contact.setName(imya);
    contact.setPhone(telephon);
    contactDao.save(contact);
    doGet(req, resp);
  }
}
