package org.launchcode;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("CD Example", 700, "CD-R", 350);
        DVD dvd = new DVD("DVD Example1", 4700, "DVD-R", 1450);

        cd.spinDisc();
git comm        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(5000));

        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());
    }
}
