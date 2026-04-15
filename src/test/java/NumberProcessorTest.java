import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberProcessorTest {

    @Test
    void testCase1() {
        NumberProcessor np = new NumberProcessor();
        assertEquals(-1, np.processNumbers(1));
    }

    @Test
    void testCase2() {
        NumberProcessor np = new NumberProcessor();
        assertEquals(1, np.processNumbers(2));
    }

    @Test
    void testCase3() {
        NumberProcessor np = new NumberProcessor();
        assertEquals(-3, np.processNumbers(5));
    }

    @Test
void testPath3() {
    NumberProcessor np = new NumberProcessor();
    assertEquals(-3, np.processNumbers(5));
}

@Test
void testStatementCoverage() {
    NumberProcessor np = new NumberProcessor();

    np.processNumbers(0); // không vào loop
    np.processNumbers(1); // vào else
    np.processNumbers(2); // vào if + else
}
}