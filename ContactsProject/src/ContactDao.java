import java.sql.SQLException;
import java.util.List;

/**
 * DAO - data access object (объект доступа к данным)
 * Данный интерфейс описывает методы, необходимые для работы с данными
 */
public interface ContactDao {


  /**
   * Сохраняет контакт в БД
   */
  void save(Contact contact) throws SQLException;

  /**
   * Возвращает все имеющиеся контакты в БД
   * @return список контактов
   */
  List<Contact> getAllContacts() throws SQLException;

}
