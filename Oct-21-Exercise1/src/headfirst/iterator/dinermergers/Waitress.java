package headfirst.iterator.dinermergers;

import java.util.ArrayList;
import java.util.LinkedList;

public class Waitress {

  private PancakeHouseMenu pancakeHouseMenu;
  private DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    ArrayList<MenuItem> menuItems = pancakeHouseMenu.getMenuItems();
    MenuItem[] menuItemsAs = dinerMenu.getMenuItems();

    System.out.println("MENU\n----\nBREAKFAST");
    for (int i = 0; i < menuItems.size(); i++) {
      MenuItem menuItem = menuItems.get(i);
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
    System.out.println("\nLUNCH");
    for (int i = 0; i < menuItemsAs.length; i++) {
      MenuItem menuItem = menuItemsAs[i];
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }

}
