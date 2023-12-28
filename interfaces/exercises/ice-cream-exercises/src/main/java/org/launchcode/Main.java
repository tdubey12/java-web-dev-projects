package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator<Flavor> comparator = new FlavorComparator();


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator<Cone> comparator1 = new ConeComparator();


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("flavors before sorting:");
        System.out.println(flavors);
        flavors.sort(comparator);

        System.out.println("flavors after sorting:");
        System.out.println(flavors);


        System.out.println("cones before sorting:");
        System.out.println(cones);
        cones.sort(comparator1);

        System.out.println("sorting in increasing order:");
        System.out.println(cones);

    }
}