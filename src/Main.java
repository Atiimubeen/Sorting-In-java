import BubbleSortig.BubbleSorting;
import SelectionSorting.SelectionSort;
import insertionSorting.InsertionSorting;


public class Main {
    public static void main(String[] args) {
//        BubbleSorting bubbleSorting = new BubbleSorting();
        int arra[] = {1,2,5,3,2,5,6,7};
//        bubbleSorting.BubbleSorting(arra);
//        bubbleSorting.print(arra);


//        SelectionSort selectionSort = new SelectionSort();
//        int array[] = {43,1,4,5,2,98};
//
//        selectionSort.selectionSort(array);
//        selectionSort.print(array);


        InsertionSorting insertionSorting = new InsertionSorting();
        insertionSorting.insertion(arra);
        insertionSorting.print(arra);
    }
}