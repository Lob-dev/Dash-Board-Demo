package accessexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticImportTest {

    @Test
    void staticImportTest() {

        Assertions.assertEquals("A", "A");
        assertEquals("A", "A");
    }
}
