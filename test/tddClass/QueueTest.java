package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class QueueTest {
    @Test public void test_that_queue_can_be_created(){
        Queue queue = new Queue();
        assertNotNull(queue);
    }
    @Test public void  test_that_queue_is_empty(){
        Queue queue = new Queue();
        assertNotNull(queue);
    }
    @Test public void  test_that_queue_can_be_added(){
        Queue queue = new Queue();
        queue.addQueue(12);
        queue.addQueue(12);
        assertEquals(2,queue.set_size());
    }
    @Test public  void  test_that_queue_can_be_removed(){
        Queue queue = new Queue();
        queue.addQueue(12);
        queue.addQueue(12);
        queue.addQueue(12);
        queue.remove();
        assertEquals(2,queue.set_size());
    }


}
