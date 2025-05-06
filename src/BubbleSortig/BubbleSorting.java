package BubbleSortig;

public class BubbleSorting {

   public void BubbleSorting(int array[]){
        int n = array.length;
       int swap = 0;
        boolean isSwap = false;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n -i -1; j++){

                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap++;
                    isSwap = true;
                }
            }
            if (!isSwap){
                System.out.print("No swap the case is best of this code");
                break;
            }
        }
    }

    public void print(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
