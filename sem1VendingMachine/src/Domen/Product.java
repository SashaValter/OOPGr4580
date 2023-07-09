package Domen;

public class Product {
  // поля
  private int price;
  private int place;
  private String name;
  private long id;

  // конструкторы
  public Product() {
    this.price = -1;
    this.place = -1;
    this.name = "неизвестно";
    this.id = -1;
  }

  public Product(int price) {
    this();
    this.price = price;
  }

  public Product(int price, int place) {
    this();
    this.price = price;
  }

  public Product(int price, int place, String name) {
    this(price, place);
    this.name = name;
  }

  public Product(int price, int place, String name, long id) {
    this(price, place, name);
    this.id = id;
  }

  public int getPrice() {
    return price;
  }

  public void setPlace(int place) {
    this.place = place;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  @Override
  public String toString() {
    return "\nPrice = " + this.price + "\n" +
        "Place = " + this.place + "\n" +
        "Name = " + this.name + "\n" +
        "ID = " + this.id + "\n";
  }

}
