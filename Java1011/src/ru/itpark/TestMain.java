package ru.itpark;

public class TestMain {
  public static void main(String[] args) {
    Drink drink = new Soda();
    drink.open();

    Soda soda = new Soda();
    soda.open();
    soda.pour();

    Juice juice1 = new Juice();
    juice1.flavour = "apple";

    Juice juice2 = new Juice();
    juice2.flavour = "orange";

    System.out.println(juice1.flavour);

    Drink[] drinkArr = new Drink[5];
    drinkArr[0] = juice1;
    drinkArr[1] = soda;
    drinkArr[2] = juice2;
    drinkArr[3] = new Soda();
    drinkArr[4] = drink;
    for (int i = 0; i < 5; i++) {
      drinkArr[i].open();
    }

    Barman barman = new Barman();
    barman.serve(juice1);
    barman.serve(soda);



  }
}










