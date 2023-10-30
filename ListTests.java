import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilterInValid() {
        List<String> input1 = Arrays.asList("a", "b", "c","d");
        
        assertEquals(ListExamples.filter(input1,new SFound()), new ArrayList<String>());
    }

    @Test
    public void testFilterValid() {
        List<String> input1 = Arrays.asList("a", "b", "c","d");
        List<String> result = Arrays.asList("a");
        assertEquals(ListExamples.filter(input1,new AFound()), result);
    }

    @Test
    public void testFilterInValidEmpty() {
        List<String> input1 = Arrays.asList();
        
        assertEquals(ListExamples.filter(input1,new AFound()), new ArrayList<String>());
    }

    //-------------------------------------------

    @Test
    public void MergeEmptyAndOne() {
        List<String> input1 = Arrays.asList("a", "b", "c","d");
        List<String> input2 = Arrays.asList();
        List<String> result = Arrays.asList("a", "b", "c","d");
        assertEquals(ListExamples.merge(input1,input2), result);
    }

    @Test
    public void MergeRegA() {
        List<String> input1 = Arrays.asList("a", "c","e");
        List<String> input2 = Arrays.asList("b", "d", "f");
        List<String> result = Arrays.asList("a", "b", "c","d", "e", "f");        
        assertEquals(ListExamples.merge(input1,input2), result);
    }

    @Test
    public void MergeRegB() {
        List<String> input1 = Arrays.asList("a", "c","e");
        List<String> input2 = Arrays.asList("b", "d", "f");
        List<String> result = Arrays.asList("a", "b", "c","d", "e", "f");
        assertEquals(ListExamples.merge(input2,input1), result);
    }

    @Test
    public void MergeBothEmpty() {
        List<String> input1 = Arrays.asList();
        List<String> input2 = Arrays.asList();
        List<String> result = Arrays.asList();
        assertEquals(ListExamples.merge(input1,input2), result);
    }
}
