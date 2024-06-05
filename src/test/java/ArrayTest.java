import array.ArrayInterfaceImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testTraverse() {
        int arrayInit[] = {12, 34, 10, 6, 40};
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arrayInit);

        int key = 40;

        arrayImplBuilder.traverseArray();

        int position = arrayImplBuilder.findElementByValue(key);
        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + position);
        }

    }

    @Test
    public void printArrayAfterKRotation() {
        int arrayInit[] = {1, 2, 3, 4, 5};
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arrayInit);
        arrayImplBuilder.printArrayRightRotatedKtimes(2);
    }

    @Test
    public void insertElement() {
        int arrayInit[] = new int[6];
        Arrays.fill(arrayInit, 0);
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arrayInit);
        //ArrayIndexOutOfBoundsException
        //arrayImplBuilder.insertInAnyPosition(40, 6);
        arrayImplBuilder.insertInAnyPosition(1, 0);
        arrayImplBuilder.insertInAnyPosition(40, 5);
        arrayImplBuilder.traverseArray();

    }

    @Test
    public void deleteElement() {
        int arr[] = {1, 2, 3, 4, 5};
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arr);
        arrayImplBuilder.deleteElement(3);
    }

    @Test
    public void reverseExtra() {
        int arr[] = {1, 2, 3, 4, 5, 7, 9, 10};
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arr);
        arrayImplBuilder.reverseArrayExtra(arr);
    }

    @Test
    public void reverseLoop() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arr);
        arrayImplBuilder.reverseArrayLoop(arr);
    }

    @Test
    public void reverseStack() {
        int arr[] = {1, 2, 3, 4, 5};
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arr);
        arrayImplBuilder.reverseArrayStack(arr);
    }

    @Test
    public void bubbleSortTest() {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arr);
        arrayImplBuilder.bubbleSort(arr);
    }

    @Test
    public void selectionSortTest() {
        int arr[] = {64,24,12,22,11};
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arr);
        arrayImplBuilder.selectionSort(arr);
    }

    @Test
    public void insertionSortTest() {
        int arr[] = {12,11,13,5,6};
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(arr);
        arrayImplBuilder.insertionSort(arr);
    }



}
