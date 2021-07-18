package StephensAlgorithms.NumericalAlgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumericalAlgorithmsTests {
    NumericalAlgorithms numericalAlgorithms = new NumericalAlgorithms();

    @Test
    public void positiveNumberIsPrimeReturnTrue(){
        assertTrue(numericalAlgorithms.numberIsPrime(3));
    }
    @Test
    public void positiveNumberIsPrimeReturnFalse(){
        assertFalse(numericalAlgorithms.numberIsPrime(4));
    }
    @Test
    public void positiveNumberIsPrimeReturnFalseFor0(){
        assertFalse(numericalAlgorithms.numberIsPrime(0));
    }
}
