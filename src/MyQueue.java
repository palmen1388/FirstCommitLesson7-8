public class MyQueue <T extends Number> {

    private QueueElement<T> first;

    public void push(T value) {
        QueueElement<T> newElement = new QueueElement<>(value);
        if (first == null) {
            first = newElement;
        } else {
            QueueElement<T> currentElement = first;
            while (currentElement.getNext() != null) {
                currentElement = currentElement.getNext();
            }
            currentElement.setNext(newElement);
        }
    }

    public void pop() {
        QueueElement<T> newFirst = first;
        first = null;
        System.out.println("Элемент " + newFirst.getValue() + " удален");
        newFirst = newFirst.getNext();
        first = newFirst;
    }

    public void print() {
        QueueElement<T> currentElement = first;
        while (currentElement != null) {
            System.out.println(currentElement.getValue());
            currentElement = currentElement.getNext();
        }
    }
}
