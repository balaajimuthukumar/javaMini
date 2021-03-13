package Tests;
import com.company.Selectionsort;
import org.junit.Test;
import java.util.Arrays;
//This selection sort unit test is my first junit based unit test and is a
//copy of code snippets from internet with minor changes. Upcoming codes will
//not be a copy but solely written by me
public class SelectionSortTest {
    @Test
    public void emptyArrayTest(){
        int[] value = { };
        Selectionsort.Sort(value);
    }

    @Test
    public void singleValueTest(){
        int[] value = {1};
        Selectionsort.Sort(value);
        assert Arrays.equals(new int[] {1},value);
    }

    @Test
    public void sortingTest(){
        int[] value = { 9, -3, 5, 0, 1};
        int[] expectedOrder = { -3, 0, 1, 5, 9};
        Selectionsort.Sort(value);
        assert Arrays.equals(expectedOrder,value);
    }
}
