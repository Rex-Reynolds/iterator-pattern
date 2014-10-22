package headfirst.iterator.dinermergeri;

import java.util.LinkedList;

public class MenuTestDrive {

  public static void main(String args[]) {
    Menu pancakeHouseMenu = new PancakeHouseMenu();
    Menu dinerMenu = new DinerMenu();
    Menu vMenu = new VesuviosMenu();
    LinkedList<Menu> menus = new LinkedList<Menu>();
    menus.add(pancakeHouseMenu);
    menus.add(dinerMenu);
    menus.add(vMenu);
    Waitress waitress = new Waitress(menus);
    waitress.printMenu();
    waitress.printVegetarianMenu();

    System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
    System.out.print("Waitress says: ");
    if (waitress.isItemVegetarian("Hotdog")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    System.out.println("\nCustomer asks, are the Waffles vegetarian?");
    System.out.print("Waitress says: ");
    if (waitress.isItemVegetarian("Waffles")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
