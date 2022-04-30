package br.com.mkk.romantoint;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;    
    
public class RomanToIntTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void testRomanToIntUsingMap() {
        int expected = 4;
        int result = RomanToInt.romanToIntUsingMap("IV");
        assertEquals(expected, result);
    }
}
    