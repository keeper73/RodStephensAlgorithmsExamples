package StephensAlgorithms.LinkedListAlgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListTests {


    @Test
    public void positiveCheckAddToBack(){
        List linkedList = new List();
        linkedList.addToBack(1);
        linkedList.addToBack(3);
        linkedList.addToBack(7);
        linkedList.addToBack(9);
        assertEquals("1 3 7 9",linkedList.printList());
    }

    @Test
    public void positiveCheckAddToFront(){
        List linkedList = new List();
        linkedList.addToBack(1);
        linkedList.addToBack(3);
        linkedList.addToBack(7);
        linkedList.addToBack(9);
        linkedList.addToFront(8);
        assertEquals("8 1 3 7 9",linkedList.printList());
    }

    @Test
    public void positiveRabbitAndTurtleAlgorithmCheckIsFalse(){
        List linkedList = new List();
        linkedList.addToBack(1);
        linkedList.addToBack(3);
        linkedList.addToBack(7);
        linkedList.addToBack(9);
        assertFalse(linkedList.loopCheckWithRabbitAndTurtle());
    }

    @Test
    public void positiveRabbitAndTurtleAlgorithmCheckIsTrue(){
        List linkedList = new List();
        linkedList.addToBack(1);
        ListItem cyclePoint = linkedList.addToBackAndReturn(3);
        linkedList.addToBack(7);
        linkedList.addToBack(9);
        linkedList.addCycleItemToBack(33,cyclePoint);
        assertTrue(linkedList.loopCheckWithRabbitAndTurtle());
    }
}
