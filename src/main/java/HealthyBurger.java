public class HealthyBurger extends Burger {

  private String add4;
  private double add4Price;

  private String add5;
  private double add5Price;

  public HealthyBurger(double price, String breadType) {
    super("Veggie", price, breadType, "Veggie patty");
  }

  public void setAdd4(String add4) {
    this.add4 = add4;
    this.add4Price = 1.50;
  }
    public void setAdd5(String add5){
      this.add5 = add5;
      this.add5Price = 1.50;
    }

  @Override
  public double howMuchForTheBurger() {
    double thisBurgerPrice = super.howMuchForTheBurger();

    if (this.add4 != null){
      thisBurgerPrice += this.add4Price;
      System.out.println("Dodano " + this.add4 + ", dodatkowy koszt to " + this.add4Price + " zł");
    }

    if (this.add5 != null){
      thisBurgerPrice += this.add5Price;
      System.out.println("Dodano " + this.add5 + ", dodatkowy koszt to " + this.add5Price + " zł");
    }

    return thisBurgerPrice;
  }
}
