public class QueueElement<T> {

    private QueueElement<T> next;
    private T value;

    public QueueElement(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public QueueElement<T> getNext() {
        return next;
    }

    public void setNext(QueueElement<T> next) {
        this.next = next;
    }
}
