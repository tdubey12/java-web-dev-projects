package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems=new ArrayList<>();

    LocalDate updatedDate;

    public void addMenuItem(MenuItem menuItem){
        if(!menuItems.contains(menuItem)) {
            menuItems.add(menuItem);
            updatedDate = LocalDate.now();
        }else{
            System.out.println("duplicate item:"+menuItem.getName());
        }
    }
    public void removeMenuItem(MenuItem menuItem){
        menuItems.remove(menuItem);
        updatedDate =LocalDate.now();
    }
    public ArrayList<MenuItem> getMenuItems(){

        return menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
