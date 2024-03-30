package tests;
import src.prod.*;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class StackTests {

    public Stack<Integer> stack;

    @Before
    public void setUp() {
        stack = new Stack<Integer>();
    }

    @Test
    public void testPushAndPeek() {
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
    }
}