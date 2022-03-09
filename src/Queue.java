public class Queue {

    private QueueElement first;
    protected int size = 0;

    public void push(int value) {
        QueueElement newElement = new QueueElement(value);
        if (first == null) {
            first = newElement;
            size++;
        } else {
            QueueElement currentElement = first;
            while (currentElement.getNext() != null) {
                currentElement = currentElement.getNext();
            }
            currentElement.setNext(newElement);
            size++;
        }
    }

    public void pop() {
        QueueElement newFirst = first;
        first = null;
        System.out.println("Элемент " + newFirst.getValue() + " удален");
        newFirst = newFirst.getNext();
        first = newFirst;
        size--;
    }

    public void print() {
        QueueElement currentElement = first;
        while (currentElement != null) {
            System.out.println(currentElement.getValue());
            currentElement = currentElement.getNext();
        }
    }
}
