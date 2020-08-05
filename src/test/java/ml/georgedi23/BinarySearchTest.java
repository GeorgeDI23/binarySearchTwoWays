package ml.georgedi23;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BinarySearchTest {

    BinarySearch search;
    @Before
    public void init(){
        search = new BinarySearch();
    }

    @Test
    public void binarySearchIterativeTest(){
        //Given
        Integer[] givenArray = {1, 4, 5, 23, 82, 99, 111};
        Integer expected = 111;

        //When
        Integer retrievedIndex = search.iterativeBinarySearch(givenArray, expected);
        Integer actual = givenArray[retrievedIndex];

        //Then
        assertEquals(expected, actual);

    }

}
