package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class SetTest {
    @Test  public void test_that_set_can_be_created() {
        Set set = new Set();
        assertNotNull(set);
    }
    @Test  public  void test_that_set_is_empty(){
        Set set = new Set();
        assertNotNull(set);
    }
    @Test public void test_that_item_can_be_added_to_the_set(){
        Set set = new Set();
        set.add_item(0,1234);
        set.add_item(1,1239);
        assertEquals(2,set.getSize());
    }
    @Test public void test_that_value_can_override(){
        Set set = new Set();
        set.add_item(0,1234);
        set.add_item(1,1239);
        set.add_item(1,123);
        assertEquals(2,set.getSize());

    }


    }


