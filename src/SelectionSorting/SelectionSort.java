package SelectionSorting;

public class SelectionSort {
    public void selectionSort(int[] a){
        for (int j = 0; j < a.length; j++){
            int minimumIndux = j;
            for (int i = j + 1; i < a.length; i++){
                if (a[i] < a[minimumIndux]){
                    minimumIndux = i;
                }
            }
            if (minimumIndux != j){
                int temp = a[j];
                a[j] = a[minimumIndux];
                a[minimumIndux] = temp;
            }
        }
    }
    public void printSelectionSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }
}
