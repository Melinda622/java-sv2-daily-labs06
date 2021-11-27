package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumbersTest {
    PerfectNumbers perfect;

    @Test
    void isPerfectNumberTest(){
        perfect=new PerfectNumbers();
        perfect.isPerfectNumber(6);
        assertEquals(true,perfect.isPerfectNumber(6));
        assertEquals(false,perfect.isPerfectNumber(8));
    }
}
