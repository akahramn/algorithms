package sortAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Selection sort is in-place algoritm
     * O(n^2) time complexity
     * Doesn't require s much swap s bubble sort
     * Unstable algorithm
     */

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(intArray);
        writeArray(intArray);
    }
    public static void selectionSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length -1;  lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            int biggestValueIndex = 0;

            for (int i = 1; i <= lastUnsortedIndex ; i++) {
                if (intArray[i] > intArray[biggestValueIndex])
                    biggestValueIndex = i;
            }
            swap(intArray, biggestValueIndex, lastUnsortedIndex);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (array[i] == array[j]) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void writeArray(int[] intArray){
        for (int i = 0; i <= intArray.length - 1; i++) {
            System.out.println(intArray[i]);
        }
    }
}
