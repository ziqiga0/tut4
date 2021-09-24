package tutorial4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestCalc{
    public Integer num1 = 1 ;
    public Integer num2 = 1 ;

    @Test
    public void testCalc(){
        Calc c = new Calc();
        Integer num3 = c.add(num1,num2);
        Integer num4 = num1 + num2;
        assertTrue(num3 == num4);
    }

}
