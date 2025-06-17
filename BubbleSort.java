public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        System.out.println("Before sorting:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nAfter sorting:");
        printArray(array);
    }

    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int pass = 0; pass < array.length - 1; pass++) {
            for (int i = 0; i < array.length - 1 - pass; i++) {
                if (array[i + 1] < array[i]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
