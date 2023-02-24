package Junit_Practice;
import static org.junit.Assert.*;

public abstract class MathUtilsTest {
    MathUtils mathUtils = new MathUtils();
    int expected = 2;
    int actual = mathUtils.add(1,1);
    AssertEquals(expected, actual);

}
