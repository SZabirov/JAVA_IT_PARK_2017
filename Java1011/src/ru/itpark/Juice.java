package ru.itpark;

import java.util.Date;

public class Juice extends Drink {
  String flavour;
  Date expireDate;

  @Override
  void open() {
    System.out.println("Сок со вкусом " + flavour + " открыт");
  }

  //  boolean isOk (Date currentDate) {
//    expireDate.compareTo(currentDate);
//  }
}
