package tddClass;

import org.testng.annotations.Test;


import static org.junit.Assert.*;

public class ArrayListTest {
    @Test public void ArrayListCanBeCreated(){
        ArrayList arrayList = new ArrayList();
        assertNotNull(arrayList);
    }
    @Test public void ArrayList_Is_Empty(){
        ArrayList arrayList = new ArrayList();
        assertNotNull(arrayList);
    }
    @Test public void addTest(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        assertEquals(5,arrayList.Size());
    }
    @Test public void test_that_array_list_can_have_index(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, 1);
        arrayList.add(1, 1234);
        arrayList.add(2, 3445);
        assertEquals(3, arrayList.Size());
    }
    @Test public void  test_that_the_index_start_from_zero(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(12345);
        assertEquals(12345, arrayList.get(0));
        arrayList.add(6789);
        assertEquals(6789,arrayList.get(1));
    }
    @Test public void test_that_element_can_be_removed_the_array_list(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(789);
        arrayList.add(1000);
        arrayList.add(1111);
        arrayList.remove(0);
        assertEquals(4,arrayList.Size());
    }
    @Test public void test_that_array_list_can_be_expanded(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(789);
        arrayList.add(1000);
        arrayList.add(1111);
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(789);
        arrayList.add(1000);
        arrayList.add(1111);
        arrayList.add(1111);
        arrayList.add(1111);
        assertEquals(12,arrayList.Size());


    }
}
