package org.launchcode;

public class Main {



    public static void main(String[] args) {

        MenuItem menuItem = new MenuItem("Idli","Rice ball", 2, "snacks",true);
        //(String name, String description, double price, String category, boolean isItNew)
        Menu menu =new Menu();
        menu.addMenuItem(menuItem);


        System.out.println(menu.getMenuItems());

        menuItem =new MenuItem ("dosa","rice flat bread", 7,"snacks",false);
        menu.addMenuItem(menuItem);
        System.out.println(menu.getMenuItems());
    }
}
