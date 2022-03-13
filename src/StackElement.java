public class StackElement <T extends Number>{

    private StackElement <T> next;
    private T value;

    public StackElement(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public StackElement<T> getNext() {
        return next;
    }

    public void setNext(StackElement <T> next) {
        this.next = next;
    }
}
