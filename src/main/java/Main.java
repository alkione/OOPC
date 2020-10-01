public class Main {
  public static void main(String[] args) {


    Burger burger = new Burger("Classic", 10.25, "biała buła", "wołowina");
    System.out.println("Cena podstawowa za " + burger.getName() +  " burgera: " + burger.getPrice() + "  zł");
    burger.setAdd1("sałata");
    burger.setAdd2("bekon");
    burger.setAdd3("jalapeno");

    System.out.println("Cena za "  + burger.getName() +  " burgera: " + burger.howMuchForTheBurger() + " zł\n");



    HealthyBurger hBurger = new HealthyBurger(20.50,"zdrowa buła");

    System.out.println("Cena podstawowa za " + hBurger.getName() +  " burgera: " + hBurger.getPrice() + "  zł");
    hBurger.setAdd1("sałata");
    hBurger.setAdd2("wege ser");
    hBurger.setAdd3("jalapeno");
    hBurger.setAdd4("tofu");
    hBurger.setAdd5("seitan");

    System.out.println("Cena za "  + hBurger.getName() +  " burgera: " + hBurger.howMuchForTheBurger() + " zł\n");


    DeluxeBurger dBurger = new DeluxeBurger(30.77,"dzisiejsza buła");

    System.out.println("Cena podstawowa za " + dBurger.getName() +  " burgera: " + dBurger.getPrice() + "  zł");
    dBurger.setAdd1("sałata");
    dBurger.setAdd2("salami");
    dBurger.setAdd3("jalapeno");
    dBurger.setAdd4("jajko sadzone");
    dBurger.setAdd5("chedar");

    System.out.println("Cena za "  + dBurger.getName() +  " burgera: " + dBurger.howMuchForTheBurger() + " zł\n");

    System.out.println(burger.getAdd2Name());
    System.out.println(hBurger.getAdd2Name());
    System.out.println(dBurger.getAdd2Name());

    System.out.println(burger.getBreadType());
    System.out.println(hBurger.getBreadType());
    System.out.println(dBurger.getBreadType());




  }
}
