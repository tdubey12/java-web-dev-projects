package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void stringWithBracketsAndCharactersReturnsTrue(){

        assertTrue(BalancedBrackets.hasBalancedBrackets("[a b c]"));
    }
    @Test
    public void stringWithOpenBracketAndCharactersReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[abc"));
    }
    @Test
    public void stringWithCloseBracketAndCharactersReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("abc]"));
    }
    @Test
    public void onlyOppositeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void onlyBracketsWithMultipleCharactersReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]abc"));


    }
    @Test
    public void multipleCharactersWithOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("abc["));
    }
    @Test
    public void multipleCharactersWithOnlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("abc[]"));
    }
    @Test
    public void moreOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]"));
    }
    @Test
    public void moreCloseBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]["));
    }
    @Test
    public void onlyBracketsWithMultipleCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]abc"));
    }
    @Test
    public void multipleCharactersWIthMultipleBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("ab[]cd[]"));
    }
}