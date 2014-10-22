package headfirst.iterator.dinermergers;

public class MenuTestDrive {

  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    VesuviosMenu vMenu = new VesuviosMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, vMenu);
    waitress.printMenu();
  }

}
