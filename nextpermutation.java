import java.util.*;

//find the next element of the permutation.........
public class nextpermutation {
    public void nextper(int array[]) {
        int i = array.length - 2;
        while (i >= 0 && array[i + 1] <= array[i]) {
            i--;
        }
        if (i >= 0) {
            int j = array.length - 1;
            while (array[j] <= array[i]) {
                j--;
            }
            swap(array, i, j);
        }
        reverse(array, i + 1);
    }

    private void reverse(int[] array, int start) {
        int i = start, j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] array, int i, int j) {
        int tem = array[i];
        array[i] = array[j];
        array[j] = tem;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 8, 9, 7, 6, 5, 4 };
        nextpermutation p = new nextpermutation();
        p.nextper(array);
        System.out.print(Arrays.toString(array));
    }
}
