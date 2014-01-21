import com.neil.Hello;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @since 1/21/14
 */
public class HelloTest {

    @Test
    public void test() {
        Hello hello = new Hello("World");
        assertEquals(9, hello.add(7,3));
    }


}
