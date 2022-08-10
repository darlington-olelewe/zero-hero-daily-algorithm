package xbonacciQuestions;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import xbonacciQuestions.Tribonacci;

import static org.junit.Assert.*;

public class TribonacciTest {
    private Tribonacci variabonacci;

    @Before
    public void setUp() throws Exception {
        variabonacci = new Tribonacci();
    }

    @After
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    private double precision = 1e-10;

    @Test
    public void sampleTests() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10), precision);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10), precision);
    }
}