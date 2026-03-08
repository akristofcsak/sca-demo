import com.demo.TestClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassTest {
    @Test
    void demoTest() {
        assertEquals(2, TestClass.sum(1, 1));
    }
}
