import java.util.ArrayList;

abstract class IntegerManager {
    /** Core data structure to hold your integer list */
    protected int[] nums;

    /** Adds integers to the list until a sentinel value is submitted */
    abstract void buildList();




    /** Uses selection shuffle algorithm */
    abstract void shuffle();
    //loop through all numbers, index i 
    //pick random sport r
    // 3 part swap r -> temp 

    /** Sorts the list of integers using insertion sort */
    abstract void insertionSort();

    /** Sorts the list of integers using selection sort */
    abstract void selectionSort();

    /** Sorts the list of integers using merge sort */
    abstract void mergeSort();

    /** Returns a random integer from the nums list */
    abstract int pickRandom();
}
