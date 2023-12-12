package org.launchcode;

public class Main {



    public static void main(String[] args) {

        MenuItem menuItem1 = new MenuItem("Idli","Rice ball", 2, "snacks");
        //(String name, String description, double price, String category, boolean isItNew)
        Menu menu =new Menu();
        menu.addMenuItem(menuItem1);
        System.out.println(menuItem1);
        System.out.println(menu);

        MenuItem menuItem2 =new MenuItem ("dosa","rice flat bread", 7,"snacks");
        menu.addMenuItem(menuItem2);
        System.out.println(menuItem2);
        System.out.println(menu);

        System.out.println(menuItem1.equals(menuItem2));

        MenuItem menuItem3 =new MenuItem ("dosa","rice flat bread", 8,"snacks");
        menu.addMenuItem(menuItem3);
        System.out.println(menu);
        System.out.println(menuItem3.equals(menuItem2));

    }
}
