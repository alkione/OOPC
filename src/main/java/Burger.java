public class Burger {
  private String name;
  private double price;
  private String breadType;
  private String meet;

  private String add1;
  private double add1Price;

  private String add2;
  private double add2Price;

  private String add3;
  private double add3Price;

  private String add4;
  private double add4Price;

  public Burger(String name, double price, String breadType, String meet) {
    this.name = name;
    this.price = price;
    this.breadType = breadType;
    this.meet = meet;
  }

  /// adding stuff to burger
  public void setAdd1(String add1) {
    this.add1 = add1;
    this.add1Price = 3.50;
  }

  public void setAdd2(String add2) {
    this.add2 = add2;
    this.add2Price = 2.50;
  }

  public void setAdd3(String add3) {
    this.add3 = add3;
    this.add3Price = 1.50;
  }

  public void setAdd4(String add4) {
    this.add4 = add4;
    this.add4Price = 0.50;
  }


  public double howMuchForTheBurger () {
    double thisBurgerPrice = this.price;  //base price

    if (this.add1 != null){
      thisBurgerPrice += this.add1Price;
      System.out.println("Dodano " + this.add1 + ", dodatkowy koszt to " + this.add1Price + " zł");
    }

    if (this.add2 != null){
      thisBurgerPrice += this.add2Price;
      System.out.println("Dodano " + this.add2 + ", dodatkowy koszt to " + this.add2Price + " zł");
    }

    if (this.add3 != null){
      thisBurgerPrice += this.add3Price;
      System.out.println("Dodano " + this.add3 + ", dodatkowy koszt to " + this.add3Price + " zł");
    }

    if (this.add4 != null){
      thisBurgerPrice += this.add4Price;
      System.out.println("Dodano " + this.add4 + ", dodatkowy koszt to " + this.add4Price + " zł");
    }
    return thisBurgerPrice;
  }


  /// getters
  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String getBreadType() {
    return breadType;
  }

  public String getMeet() {
    return meet;
  }

  public String getAdd2Name(){
    return add2;
  }

}
