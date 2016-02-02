package source;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class FilterTest {

    @Test
    public void testIntFilter() {
        PredicateInterfase<Integer> even = new PredicateInterfase<Integer>() {
            @Override
            public <S extends Integer> boolean status(S value) {
                return value.intValue() == 68;
            }
        };
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(37);
        list.add(68);
        List<Integer> result = new ArrayList<>();
        result.add(68);
        assertEquals(Utilite.filter((ArrayList<Integer>) list, even), result);
    }

    @Test
    public void testStringFilter() {
        PredicateInterfase<String> sizeMoreThree = new PredicateInterfase<String>() {
            @Override
            public <S extends String> boolean status(S value) {
                return value.length() < 3;
            }
        };
        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("Feel");
        list.add("Shook");
        List<String> result = new ArrayList<>();
        result.add("I");
        assertEquals(Utilite.filter((ArrayList<String>) list, sizeMoreThree), result);
    }
}