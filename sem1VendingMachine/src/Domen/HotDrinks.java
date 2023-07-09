package Domen;

public class HotDrinks extends Product {
  // поля
  private int temperature;
  // свойства
  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }
  //конструктор
  public HotDrinks(int price, int place, String name, long id) {
    super(price, place, name, id);
    this.temperature = 0;
  }
  public HotDrinks(int price, int place, String name, long id, int temperature) {
    super(price, place, name, id);
    this.temperature = temperature;
  }
  @Override
  public String toString() {
    return super.toString() + "\ntemperature=" + temperature;
  }

}
