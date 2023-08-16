package sortAlgorithms;
/*Buble sort algorithm time complexity is O(n ^ 2)
* First loop complexity n and second loop comlexity n.
* this loops inner loops there for compleity is n * n there for Time Complexity is O(n ^ 2).
*  */
public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        printArray(intArray);
    }

    public static void swap(int[] array, int i, int j) {

        if (array[i] == array[j]) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] arrray) {
        for (int i = 0; i < arrray.length; i++) {
            System.out.println(arrray[i]);
        }
    }
}
