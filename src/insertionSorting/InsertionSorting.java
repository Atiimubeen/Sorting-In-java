package insertionSorting;

public class InsertionSorting {

    public void insertion(int[] a){
        for (int i = 1; i < a.length; i++){
            int current = i;
            int previous = i-1;

            while (a[previous] >= 0 && a[previous] > a[current]){
                a[previous + 1] = a[previous];
                previous--;
            }
            a[previous + 1] = a[current];
        }
    }

    public void print(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
