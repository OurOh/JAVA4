package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        // GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Object object = integerBox.get();

    }
}
