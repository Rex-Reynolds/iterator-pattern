package headfirst.iterator.dinermergers;

import java.util.ArrayList;
import java.util.LinkedList;

public class Waitress {

  private PancakeHouseMenu pancakeHouseMenu;
  private DinerMenu dinerMenu;
  private VesuviosMenu vMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, VesuviosMenu vMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.vMenu = vMenu;
  }

  public void printMenu() {
    ArrayList<MenuItem> menuItems = pancakeHouseMenu.getMenuItems();
    MenuItem[] menuItemsAs = dinerMenu.getMenuItems();
    LinkedList<MenuItem> vMenuItems = vMenu.getMenuItems();

    System.out.println("MENU\n----\nBREAKFAST");
    for (int i = 0; i < menuItems.size(); i++) {
      MenuItem menuItem = menuItems.get(i);
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
    System.out.println("\nLUNCH");
    for (int i = 0; i < 3; i++) {
      MenuItem menuItem = menuItemsAs[i];
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
    
    System.out.println("\nVesuvios");
    for (int i = 0; i < vMenuItems.size(); i++) {
      MenuItem menuItem = vMenuItems.get(i);
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }

}
