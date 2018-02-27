/**
 * Модель Contact представляет информацию о контакте (id, name, phone)
 * и методы доступа (get...) к полям, методы изменения данных полей (set...)
 */
public class Contact {
  /**
   * Данные поля объявлены private, что это? google it!
   */
  private int id;
  private String name;
  private String phone;

  /**
   * Конструктор. Вызывается при создании нового объекта класс Contact
   * Инициализирует следующие поля: id, name и phone
   */
  public Contact(int id, String name, String phone) {
    this.id = id;
    this.name = name;
    this.phone = phone;
  }

  /**
   *
   * @param s
   * @param name
   */
  public Contact(String s, String name) {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
