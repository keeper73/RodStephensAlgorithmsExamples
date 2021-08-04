package StephensAlgorithms.ArrayAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayAlgorithmsTests {

    @Test
    public void distanceToTheNearestEdge6x6(){
        int [][] result = ArrayAlgorithms.distanceToTheNearestEdge(6,6);
        assertEquals("[[0, 0, 0, 0, 0, 0], [0, 1, 1, 1, 1, 0], [0, 1, 2, 2, 1, 0], [0, 1, 2, 2, 1, 0], [0, 1, 1, 1, 1, 0], [0, 0, 0, 0, 0, 0]]",Arrays.deepToString(result));
    }

    @Test
    public void distanceToTheNearestEdge3x3(){
        int [][] result = ArrayAlgorithms.distanceToTheNearestEdge(3,3);
        assertEquals("[[0, 0, 0], [0, 1, 0], [0, 0, 0]]",Arrays.deepToString(result));
    }

    @Test
    public void distanceToTheNearestEdge2x2(){
        int [][] result = ArrayAlgorithms.distanceToTheNearestEdge(2,2);
        assertEquals("[[0, 0], [0, 0]]",Arrays.deepToString(result));
    }


}
