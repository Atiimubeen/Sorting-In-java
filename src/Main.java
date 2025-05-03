import BubbleSortig.BubbleSorting;


public class Main {
    public static void main(String[] args) {
        BubbleSorting bubbleSorting = new BubbleSorting();
        int arra[] = {1, 2, 5, 8, 9, 34, 1, 23};
        bubbleSorting.BubbleSorting(arra);
        bubbleSorting.printBubbleSort(arra);
    }
}