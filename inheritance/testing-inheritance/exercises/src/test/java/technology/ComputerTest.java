package technology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {

    @Test
    public void testBrand(){
        Computer myComputer =new Computer();
        myComputer.setBrand("intel");
        assertEquals("intel",myComputer.getBrand());
    }

    @Test
    public void testColour() {
        Computer myComputer = new Computer();
        myComputer.setColour("grey");
        assertEquals("grey", myComputer.getColour());
    }
        @Test
    public void testRamSize() {
        Computer myComputer =new Computer();
        myComputer.setRamSize(32);
        assertEquals(32,myComputer.getRamSize());
        }

    }

