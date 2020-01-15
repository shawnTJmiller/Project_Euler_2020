import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesOf3And5Test {
    MultiplesOf3And5 newTest = new MultiplesOf3And5();
    @Test
    public void sumOfMultiples() {
        assertEquals(3, newTest.sumOfMultiples(3));
        assertEquals(8, newTest.sumOfMultiples(5));
        assertEquals(14, newTest.sumOfMultiples(6));
        assertEquals(33, newTest.sumOfMultiples(10));
        assertEquals(234168, newTest.sumOfMultiples(1000));
        assertEquals(543, newTest.sumOfMultiples(49));
        assertEquals(89301183, newTest.sumOfMultiples(19564));
        assertEquals(16687353, newTest.sumOfMultiples(8456));
    }
}