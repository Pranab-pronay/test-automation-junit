import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;

@RunWith(Parameterized.class)
public class MinDataDrivenTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { Arrays.asList("cat", "dog", "elephant"), "cat" }, // Minimum string
                { Arrays.asList(5, 3, 8, 1), 1 }, // Minimum integer
                { Arrays.asList(2.5, 1.3, 3.7), 1.3 }, // Minimum double
                { Arrays.asList('b', 'a', 'c'), 'a' } // Minimum character
        });
    }

    private List<?> inputList;
    private Object expectedResult;

    public MinDataDrivenTest(List<?> inputList, Object expectedResult) {
        this.inputList = inputList;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testMin() {
        Object result = Min.min(inputList);
        assertEquals(expectedResult, result);
    }
}
