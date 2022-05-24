package assignments;

public class ArrayOfTenNumber {
    int maximum = 0;
    int sum = 0;
    int average = 0;


    public int sumOfArray() {
        int[] numbers = {1, 2, 3, 6, 7, 8, 9, 4, 5, 0};
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int maximumOfArray() {
        int[] numbers = {1, 2, 3, 6, 7, 8, 9, 4, 5, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }

    public int averageOfArray() {
        int[] numbers = {1, 2, 3, 6, 7, 8, 9, 44, 5, 0};
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            average = sum/ numbers.length;
        }
        return average;
    }
}