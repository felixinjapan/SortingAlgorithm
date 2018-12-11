public class QuickSort {

    // In case of you want to see output on console
    public static void main(String[] args) {
        int[] array = { 9, 1, 2, 3, 5, 2 };
        QuickSort quicksort = new QuickSort();
        quicksort.sort(0, array.length - 1, array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void sort(int firstIndex, int lastIndex, int[] array) {
        if (firstIndex >= lastIndex) {
            return;
        }
        int partitionIndex = parition(firstIndex, lastIndex, array);
        sort(firstIndex, partitionIndex - 1, array);
        sort(partitionIndex + 1, lastIndex, array);
    }

    private int parition(int firstIndex, int lastIndex, int[] array) {
        int pivot = array[lastIndex];
        int i = firstIndex;
        int partitionIndex = lastIndex;
        for (int j = firstIndex; j <= lastIndex; j++) {
            if (pivot >= array[j]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                // Remember the position in case of pivot switched
                if (j == lastIndex) {
                    partitionIndex = i;
                }
                i++;
            }
        }
        return partitionIndex;
    }

}
