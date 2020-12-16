package by.test.arrayofnumbers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestArrayOfNumbers {
    @Test
    public void whenNumberOnePlusNumberTwoEqualsValueEqualsEight() {
       int[] array = new int[] {1,2,3,4,5};
       ArrayOfNumbers arr = new ArrayOfNumbers(array, 8);
       String result = arr.sum();
       String expected = "Первый элемен = 2, Второй элемент = 4";
       assertThat(result, is(expected));
    }

    @Test
    public void whenNumberOnePlusNumberTwoEqualsValueEqualsFive() {
        int[] array = new int[] {1,2,3,4,5};
        ArrayOfNumbers arr = new ArrayOfNumbers(array, 5);
        String result = arr.sum();
        String expected = "Первый элемен = 0, Второй элемент = 3";
        assertThat(result, is(expected));
    }

    @Test
    public void whenNumberOnePlusNumberTwoEqualsValueEqualsNine() {
        int[] array = new int[] {1,2,3,4,5};
        ArrayOfNumbers arr = new ArrayOfNumbers(array, 9);
        String result = arr.sum();
        String expected = "Первый элемен = 3, Второй элемент = 4";
        assertThat(result, is(expected));
    }
}
