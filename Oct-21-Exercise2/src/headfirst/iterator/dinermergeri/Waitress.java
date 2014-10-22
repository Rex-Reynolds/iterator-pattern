package headfirst.iterator.dinermergeri;

import java.util.Iterator;
import java.util.LinkedList;

public class Waitress {
  private Menu dinerMenu;

  private Menu pancakeHouseMenu;
  
  private Menu VesuviosMenu;

  public Waitress(LinkedList<Menu> menus) {
    this.pancakeHouseMenu = menus.get(0);
    this.dinerMenu = menus.get(1);
    this.VesuviosMenu = menus.get(2);
  }

  public boolean isItemVegetarian(String name) {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    if (isVegetarian(name, pancakeIterator)) {
      return true;
    }
    Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
    if (isVegetarian(name, dinerIterator)) {
      return true;
    }
    Iterator<MenuItem> vIterator = VesuviosMenu.createIterator();
    if (isVegetarian(name, vIterator)) {
      return true;
    }
    return false;
  }

  public void printMenu() {
    Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
    Iterator<MenuItem> vIterator = VesuviosMenu.createIterator();

    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeIterator);
    System.out.println("\nLUNCH");
    printMenu(dinerIterator);
    System.out.println("\nVesuvios");
    printMenu(vIterator);
  }

  public void printVegetarianMenu() {
    System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
    printVegetarianMenu(pancakeHouseMenu.createIterator());
    System.out.println("\nLUNCH");
    printVegetarianMenu(dinerMenu.createIterator());
    System.out.println("\nVesuvios");
    printVegetarianMenu(VesuviosMenu.createIterator());
  }

  private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      if (menuItem.getName().equals(name)) {
        if (menuItem.isVegetarian()) {
          return true;
        }
      }
    }
    return false;
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }

  private void printVegetarianMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      if (menuItem.isVegetarian()) {
        System.out.print(menuItem.getName());
        System.out.println("\t\t" + menuItem.getPrice());
        System.out.println("\t" + menuItem.getDescription());
      }
    }
  }
}
