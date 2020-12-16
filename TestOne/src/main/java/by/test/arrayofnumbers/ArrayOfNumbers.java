package by.test.arrayofnumbers;

public class ArrayOfNumbers {
    private final int[] array;
    private final int number;

    public ArrayOfNumbers(int[] array, int number) {
        this.array = array;
        this.number = number;
    }

    public String sum() {
        int indexOne = 0;
        int indexTwo = 0;
        int firstNum = 0;
        int secondNum = 0;
        boolean run = true;
        while (run) {
            int x = number - array[indexOne];
            if (array.length - 1 == indexTwo) {
                indexOne++;
                indexTwo = 0;
            }
            if (x != array[indexTwo]) {
                indexTwo++;
            }
            if (x == array[indexTwo]) {
                firstNum = indexOne;
                secondNum = indexTwo;
                run = false;
            }
        }
        return String.format("Первый элемен = %s, Второй элемент = %s", firstNum, secondNum);
    }
}
