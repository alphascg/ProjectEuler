import mll.Problems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tester {
    @Test
    public void test_problem001(){
        Assertions.assertEquals(Problems.problem001(),233168);
    }
    @Test
    public void test_problem006(){
        Assertions.assertEquals(Problems.problem006(),25164150);
    }
    @Test
    public void test_problem009(){
        Assertions.assertEquals(Problems.problem009(),31875000);
    }
}
