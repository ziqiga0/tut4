package tutorial4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testsubtract {
    public Integer num1 = 5;
    public Integer num2 = 2 ;

    @Test
    public void testsubtract(){
        Calc c = new Calc();
        Integer num3 = c.subtract(num1,num2);
        Integer num4 = num1 - num2;
        assertTrue(num3 == num4);
    }
}
