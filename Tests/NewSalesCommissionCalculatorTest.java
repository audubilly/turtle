import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewSalesCommissionCalculatorTest {

    NewSalesCommissionCalculator newSalesCommissionCalculator;

    @BeforeEach
    void setUp() {
        newSalesCommissionCalculator = new NewSalesCommissionCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatAppCanCanGetSalesCommissionDistribution(){
//    given
        int [] salesAmount = {4000,5000,6000, 2000, 3000,3500};
//        int [] frequency = new int[9];
//        when
//        newSalesCommissionCalculator.getSalesDistribution(salesAmount, frequency);
        int[] frequency = newSalesCommissionCalculator.getSalesDistribution(salesAmount);
//        assert
        assertEquals(2,frequency[3]);
        assertEquals(1,frequency[4]);
        assertEquals(1,frequency[5]);
        assertEquals(1,frequency[1]);
        assertEquals(1,frequency[2]);
        assertEquals(0,frequency[8]);
        assertEquals(0,frequency[7]);



    }
}