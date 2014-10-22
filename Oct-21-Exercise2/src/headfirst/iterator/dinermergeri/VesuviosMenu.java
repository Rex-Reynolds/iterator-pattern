/**
 * VesuviosMenu.java 1.0 Oct 22, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds. All Rights Reserved
 */
package headfirst.iterator.dinermergeri;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Start each Class or interface with a summary description line
 *
 * @author RexIII
 * @version 1.0
 *
 */
public class VesuviosMenu implements Menu {
  LinkedList<MenuItem> menuItems;
  
  
  public VesuviosMenu(){
    menuItems = new LinkedList<MenuItem>();
    addItem("Baked Ziti","This be Pasta",true,2.99);
    addItem("Cheese Ravioli","This is also Paste",true,2.99);
    addItem("Manicotti","This might be pasta?",true,2.99);
  }

  
  /**
   * @param name as
   * @param description as
   * @param vegetarian as
   * @param price as
   */
  public void addItem(String name, String description, boolean vegetarian,
          double price) {
MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
menuItems.add(menuItem);
}
  
  /**
   * @return
   */
  public LinkedList<MenuItem> getMenuItems() {
    return menuItems;
  }
  
  public String toString() {
    return "Vesuvios Menu";
  }


  /* (non-Javadoc)
   * @see headfirst.iterator.dinermergeri.Menu#createIterator()
   */
  @Override
  public Iterator<MenuItem> createIterator() {
    return menuItems.iterator();

  }
}
