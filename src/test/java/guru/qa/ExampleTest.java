package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {

    @Test
    void exampleTest1() {
        Assertions.assertFalse(1 == 0);
    }

    @Test
    void exampleTest2() {
        Assertions.assertTrue(true);
    }
}
