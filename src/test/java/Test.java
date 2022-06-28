import org.example.Count;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void test() {
        Count c = new Count();
        String s = c.connect("ababa", "galamaga");
        assertEquals("ababagalamaga", s);

    }
}
