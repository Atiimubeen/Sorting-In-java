package MergeSorting;
import java.util.*;

public class MergeSort {
    public  void mergeSort(int[] arr, int start, int last){
        // base case
        if (start >= last){
            return;
        }
        int mid = start+(last - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, last);
        merge(arr, start, mid, last);
    }

    public  void merge(int[] arr, int start, int mid, int last){
        int[] temp = new int[last - start +1];
        int i = start; // this is the iterator for the left part
        int j = mid + 1; // this is the iterator for the right part
        int k = 0; // this is for the temp array which initilize with 0 indux

        while (i <= mid && j <= last){
            if (arr[i] < arr[j]){
                temp[k++] = arr[i++];

            }else {
                temp[k++] = arr[j++];
            }

        }
        while (i <= mid){
            temp[k++] = arr[i++];
        }

        while (j <= last){
            temp[k++] = arr[j++];
        }

        for (k=0, i = start; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public  void print(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
