package com.fortunemaseko.assignment;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author fortune
 */
public class StringsTest {
    
    private Exercise2 ex2;
    
    public StringsTest() {
    }
  
    @Before
    public void setUp() {
        ex2 = new Exercise2();
    }
    
    @After
    public void tearDown() {
        ex2 = null;
    }
    
    @Test
    public void testCase1ForReverseString() {
        String result = ex2.reverseString("HelloWorld");
        assertNotNull(result);
        assertEquals("dlroWolleH", result);
    }
    
    @Test
    public void testCase2ForReverseString() {
        String result = ex2.reverseString("8BitPlatoon");
        assertNotNull(result);
        assertEquals("nootalPtiB8", result);
    }
    // Testing for null input
    @Test(expected = IllegalArgumentException.class)
    public void reverseStringShouldThrowAnException_For_Input_Is_Null() {
        String result = ex2.reverseString(null);
    }
    
    // Testing for empty input
    @Test(expected = IllegalArgumentException.class)
    public void reverseStringShouldThrowAnException_For_Input_Is_Empty() {
        String result = ex2.reverseString("");
    }
}
