package com.fortunemaseko.assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fortune
 */
public class IntegersTest {
    
    Exercise1 ex1;
    
    public IntegersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ex1 = new Exercise1();
    }
    
    @After
    public void tearDown() {
        ex1 = null;
    }
    // <editor-fold defaultstate="collapsed" desc="isEven() test cases">
    @Test
    public void testCase1ForIsEven() {
        Boolean input = ex1.isEven(0);
        assertNotNull(input);
        assertEquals(true, input);
    }
    
    @Test
    public void testCase2ForIsEven() {
        Boolean input = ex1.isEven(3);
        assertNotNull(input);
        assertEquals(false, input);
    }
    
    @Test
    public void testCase3ForIsEven() {
        Boolean input = ex1.isEven(6);
        assertNotNull(input);
        assertEquals(true, input);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="isPrime() test cases">
    @Test
    public void testCase1ForIsPrime() {
        Boolean result = ex1.isPrime(0);
        assertNotNull(result);
        assertEquals(false, result);
    }
    
    @Test
    public void testCase2ForIsPrime() {
        Boolean result = ex1.isPrime(3);
        assertNotNull(result);
        assertEquals(true, result);
    }
    
    @Test
    public void testCase3ForIsPrime() {
        Boolean result = ex1.isPrime(110);
        assertNotNull(result);
        assertEquals(false, result);
    }
    
    @Test
    public void testCase4ForIsPrime() {
        Boolean result = ex1.isPrime(113);
        assertNotNull(result);
        assertEquals(true, result);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="isPalindrome() test cases">
    @Test
    public void testCase1ForIsPalindrome() {
        Boolean result = ex1.isPalindrome(10);
        assertNotNull(result);
        assertEquals(false, result);
    }
    
    @Test
    public void testCase2ForIsPalindrome() {
        Boolean result = ex1.isPrime(101);
        assertNotNull(result);
        assertEquals(true, result);
    }
    
    @Test
    public void testCase3ForIsPalindrome() {
        Boolean result = ex1.isPalindrome(123321);
        assertNotNull(result);
        assertEquals(true, result);
    }
    
    // </editor-fold>

}
