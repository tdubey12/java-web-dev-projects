package org.launchcode;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems=new ArrayList<>();
    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }


}
