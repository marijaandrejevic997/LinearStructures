package array;

public interface ArrayInterface {

    //basic array operations
    void traverseArray();

    void printArrayRightRotatedKtimes(int k);

    int findElementByValue(int key);

    void insertInAnyPosition(int x, int pos);

    void deleteElement(int key);

    //reverse
    //* using an extra array
    void reverseArrayExtra(int[] arr);
    //* using a loop
    void reverseArrayLoop(int[] arr);
    //* using stack
    void reverseArrayStack(int[] arr);

    //sorting
    void bubbleSort(int[] arr);

    void selectionSort(int[] arr);

    void insertionSort(int[] arr);



}
