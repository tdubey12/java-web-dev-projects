package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 500 -1500 rpm.");

    }

    @Override
    public void mediaType() {

    }
    @Override
    public void  readData() {
        System.out.println("I am sorry.");

    }
    @Override
    public void writeData() {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
