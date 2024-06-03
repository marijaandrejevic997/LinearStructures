package array;

/**
 * elements are counted using index within current array
 * if root has index p :
 *      - left child index: 2*p + 1
 *      - right child index: 2*p + 2
 */
public class ArrayInterfaceImpl implements  ArrayInterface {

    private int numElem;
    private String[] elements;



    public ArrayInterfaceImpl(int numElem) {
        this.numElem = numElem;
        this.elements = new String[numElem];
    }

    @Override
    public void setRoot(String key) {
        elements[0] = key;
    }

    //overriding functions
    @Override
    public void setLeftElem(String key, int rootElem) {
        if (elements [rootElem] == null) {
            System.out.println("Root element can't be found.");
            return;
        }

        elements [2*rootElem + 1] = key;
    }

    @Override
    public void setRightElem(String key, int rootElem) {
        if (elements [rootElem] == null) {
            System.out.println("Root element can't be found.");
            return;
        }

        elements [2*rootElem + 2] = key;
    }

    /**
     * This method will write element, if exists.
     * If not, it will write - as sign that child doesn't exist
     */
    @Override
    public void writeTree() {
        for (int i = 0; i < numElem; i++) {
            if (elements[i] != null) {
                System.out.println(elements[i]);
            } else {
                System.out.println("-");
            }
        }
    }
}
