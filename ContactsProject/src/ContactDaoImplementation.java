import java.util.ArrayList;
import java.util.List;

/**
 * Реализация интерфейса ContactDao
 */
public class ContactDaoImplementation implements ContactDao {
  @Override
  public void save(Contact cont) {

  }

  @Override
  public List<Contact> getAllContacts() {
    List<Contact> list = new ArrayList<>();
    //fixme реализовать получение контактов из БД
    Contact contact1 = new Contact(0, "Федя", "872721710");
    Contact contact2 = new Contact(1, "Петя", "891910202");
    list.add(contact1);
    list.add(contact2);
    return list;
  }
}
