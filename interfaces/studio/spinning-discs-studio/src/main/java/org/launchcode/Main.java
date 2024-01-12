package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Cd cd = new CD(aNmae: "CD EXample", maxCapacity:600 ,aTYpe: "CD-R",someUsedCapacity: 200);
        DVD dvd =new DVD(aName: "DVD Example", maxCapacity 4500, aType: "DVD-R", someUsedCapacity: 1500);
        cd.spinDisc();
        dvd.spinDisc();
        cd.readData();
        dvd.readData();
        System.out.println(cd.writeData(dataSize 250));
        System.out.println(dvd.writeData(dataSize 8000));
        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo);


        // TODO: Declare and initialize a CD and a DVD object.


        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}