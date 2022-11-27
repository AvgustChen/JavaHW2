import java.lang.reflect.Array;
import java.util.Random;

public class program {

    static int[] CreateArray(int size){
        int[] array = new int[size];
        return array;
    }
    
    static int[] array(int[] array, int min, int max){
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(min, max);
        }
        return array;
    }

    static String PrintArray(int[] array){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                result += array[i];
            } else result += array[i] + ", ";
        }
        result += "]";
        return result;
    }

    static void MergeSort(int[] array){
        int n = array.length;
        if (n == 1) return;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = array[i + mid];
        }
        MergeSort(left);
        MergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left.length && j < right.length){
            if(left[i] <right[j]){
                array[index] = left[i];
                i++;
                index++;
            } else {
                array[i] = right[j];
                j++;
                index++;
            }
        }

        for (int ll = i; ll < left.length; ll++){
            array[index] = left[ll];
            index++;
        }

        for (int rr = j; rr < right.length; rr++){
            array[index] = right[rr];
            index++;
        }
        main.result = PrintArray(array);
    }


}