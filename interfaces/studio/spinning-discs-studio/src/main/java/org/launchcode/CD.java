package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String aName,int maxCapacity, String aType, int someUsedCapacity){
        super(aNmae, maxCapacity, aType, someUsedCapacity);
    }
    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    @Override
    public void mediaType() {

    }
    @Override
    public void readData() {
        System.out.println("Would you like to play a game?");

    }
    @Override
    public void writeData() {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
