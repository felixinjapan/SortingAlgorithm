public class MergeSort {

    // In case of you want to see output on console
    public static void main(String[] args) {
        int[] array = { 5, 6, 8, 7, 4, 2, 1, 3, 2, 2, 2, 2, 9, 111, 23, 2300, 21031203 };
        MergeSort mergesort = new MergeSort();
        mergesort.sort(0, array.length, array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void sort(int firstIndex, int length, int[] array) {
        int currentLength = length - firstIndex;
        if (currentLength < 2) {
            return;
        }
        if (currentLength == 2) {
            int lastIndex = length - 1;
            if (array[firstIndex] > array[lastIndex]) {
                int temp = array[firstIndex];
                array[firstIndex] = array[lastIndex];
                array[lastIndex] = temp;
            }
            return;
        }
        int partition = (firstIndex + length) / 2;
        sort(firstIndex, partition, array);
        sort(partition, length, array);
        merge(firstIndex, partition, length, array);
    }

    private void merge(int firstIndex, int partition, int length, int[] array) {
        int total = length - firstIndex;
        int[] merged = new int[total];
        int i = firstIndex;
        int j = partition;
        int k = 0;
        // Compare two partitions
        while (i < partition && j < length) {
            if (array[i] > array[j]) {
                merged[k] = array[j];
                j++;
            } else {
                merged[k] = array[i];
                i++;
            }
            k++;
        }
        // Fill up remaining elements
        while (i < partition) {
            merged[k] = array[i];
            i++;
            k++;
        }
        while (j < length) {
            merged[k] = array[j];
            j++;
            k++;
        }
        // Copy back to original array
        for (int m = 0; m < merged.length; m++) {
            array[firstIndex + m] = merged[m];
        }
    }
}
