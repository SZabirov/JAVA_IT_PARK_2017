import java.util.List;

/**
 * DAO - data access object (объект доступа к данным)
 * Данный интерфейс описывает методы, необходимые для работы с данными
 */
public interface ContactDao {
  /**
   * Сохраняет контакт в БД
   * @param cont
   */
  void save(Contact cont);

  /**
   * Возвращает все имеющиеся контакты в БД
   * @return список контактов
   */
  List<Contact> getAllContacts();
}
