package BubbleSortig;

public class BubbleSorting {

   public void BubbleSorting(int array[]){
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n -i -1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void printBubbleSort(int array[]){
        int n = array.length;
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
