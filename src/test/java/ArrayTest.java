import array.ArrayInterfaceImpl;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    public void writeBinaryTree() {
        ArrayInterfaceImpl arrayImplBuilder = new ArrayInterfaceImpl(10);
        arrayImplBuilder.setRoot("A");
        arrayImplBuilder.setLeftElem("B", 0);
        arrayImplBuilder.setRightElem("C", 0);
        arrayImplBuilder.setLeftElem("D", 1);
        arrayImplBuilder.setRightElem("E", 1);
        arrayImplBuilder.setRightElem("F", 2);
        arrayImplBuilder.writeTree();
    }

}
