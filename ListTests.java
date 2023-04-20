import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;


public class ListTests {
    @Test
    public void testFilter(){
    List<String> input1 = Arrays.asList("Zoo", "dog", "cat");
    assertEquals(Arrays.asList("Zoo", "dog"), ListExamples.filter(input1, n -> n.contains("o")));
    }

    @Test
    public void testMerge(){
    List<String> input1 = Arrays.asList("a", "b", "f");
    List<String> input2 = Arrays.asList("c", "d", "z");
    assertEquals(Arrays.asList("a", "b", "c", "d", "f", "z"), ListExamples.merge(input1, input2));
    }
    
}
