package Array_1D;

import java.util.Arrays;

public class MyArray {
    private int[] array;

    //Constructor
    public MyArray(int[] array) {
        this.array = array;
    }

    /**
     * Reverse the order of array like a mirror
     * For example: input [1, 2, 3] => output [1, 2, 3, 3, 2, 1]
     */
    public int[] mirror() {
        int n = array.length;
        int[] result = new int[n * 2];

        for (int i = 0; i < n; i++) {
            result[i] = array[i];
        }

        for (int i = 0; i < n; i++) {
            result[i + n] = array[n - i - 1];
        }

        return result;
    }

    /**
     * Remove all duplicate elements in the array
     * For example: input [1, 1, 2, 3, 4, 4, 5] => output [1, 2, 3, 4, 5]
     */
    public int[] removeDuplicates() {
        if (array.length == 0) return array;

        int[] temp = new int[array.length];
        temp[0] = array[0];
        int index = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                temp[index++] = array[i];
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);

        return result;
    }

    /**
     * Determine missing value from a sorted array
     * For example: [10 11 12 13 14 16 17 19 20] => 15 18
     */
    public int[] getMissingValue() {
        return null;
    }


    //Test cases
    static void main(String[] args) {
        MyArray array1 = new MyArray(new int[] {1, 2});
        MyArray array2 = new MyArray(new int[] {1, 2, 3, 3, 4});
        MyArray array3 = new MyArray(new int[] {1, 2, 2, 4, 4, 5});
        MyArray array4 = new MyArray(new int[] {1, 2, 3, 5, 7});
        MyArray array5 = new MyArray(new int[] {1, 2, 3, 4, 6, 8});

        System.out.println();

        int[] test1 = array1.mirror();
        int[] test2 = array2.removeDuplicates();
        int[] test3 = array3.removeDuplicates();
        int[] test4 = array4.getMissingValue();
        int[] test5 = array5.getMissingValue();

        System.out.println("Mirror: " + Arrays.toString(test1));
        System.out.println("Remove duplicate: " + Arrays.toString(test2));
        System.out.println("Remove duplicate: " + Arrays.toString(test3));
        System.out.println("Get missing value: " + Arrays.toString(test4));
        System.out.println("Get missing value: " + Arrays.toString(test5));
    }
}
