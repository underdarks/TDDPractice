package ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void plus() {
        //given
        int actual = Calculator.plus(1, 2);

        //when

        //then
        Assertions.assertEquals(3, actual);
        Assertions.assertEquals(5, Calculator.plus(4, 1));
    }


}
