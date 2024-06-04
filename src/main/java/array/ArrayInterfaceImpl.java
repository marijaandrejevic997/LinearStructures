package array;

import java.util.Arrays;
import java.util.Stack;

public class ArrayInterfaceImpl implements ArrayInterface{

    int arr[];

    public ArrayInterfaceImpl(int[] arr) {
        this.arr = arr;
    }


    @Override
    public void traverseArray() {
        for (int el: arr) {
            System.out.println(el + " ");
        }
    }

    private void traverseCustom(int[] custom) {
        for (int el: custom) {
            System.out.println(el + " ");
        }
    }

    @Override
    public void printArrayRightRotatedKtimes(int k) {

        //this is using new structure printing array right rotated k times
        /*int [] newArr = new int[arr.length];
        //Arrays.fill(newArr, 0);
        for (int i = 0; i< arr.length; i++) {
            newArr[(i+k)%newArr.length] = arr[i];
        }

        traverseCustom(newArr);*/

        //time complexity O(2n)


        //this is just printing array right rotated k times
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[(i+k+1) % arr.length] + " ");
        }

        //time complexity O(n)
    }

    @Override
    public int findElementByValue(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insertInAnyPosition(int x, int pos) {
        for (int i = arr.length - 1; i >= pos; i--) {
            if (i + 1 <= arr.length - 1) {
                arr[i + 1] = arr[i];
            } else {
                System.out.println("Index out of bounds");
            }
        }
        arr[pos] = x;
    }

    @Override
    public void deleteElement(int key) {
        //first find element
        int index = findElementByValue(key);
        if (index == -1) {
            System.out.println("Element not found....");
            return;
        }

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1); //to remove element
        traverseArray();
    }

    @Override
    public void reverseArrayExtra(int[] arr) {
        int reversedArray[] = new int[arr.length];
        for (int i = arr.length-1; i>=0; i--) {
            reversedArray[arr.length-1-i] = arr[i];
        }

        traverseCustom(reversedArray);
    }

    //complexity O(n)

    @Override
    public void reverseArrayLoop(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int pom = arr[start];
            arr[start] = arr[end];
            arr[end] = pom;
            start++;
            end--;
        }
        traverseCustom(arr);
    }

    //complexity O(n)

    @Override
    public void reverseArrayStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int element: arr) {
            stack.push(element);
        }

        for (int i = 0; i<arr.length; i++) {
            arr[i] = stack.pop();
        }

        traverseCustom(arr);
    }

    //complexity O(n)
}