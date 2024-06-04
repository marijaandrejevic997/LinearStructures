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
                System.out.println("Element found at position: " +  position);
            }

        }

        @Test
        public void printArrayAfterKRotation() {
            int arrayInit[] = {1,2,3,4,5};
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



}
