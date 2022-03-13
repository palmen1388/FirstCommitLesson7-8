public class MyStack<T extends Number> {

    private StackElement <T> first;
    protected int size = 0;

    public void push(T value) {
        StackElement <T> newElement = new StackElement<>(value);
        if (first == null) {
            first = newElement;
            size++;
        } else {
            StackElement <T> currentElement = newElement;
            currentElement.setNext(first);
            first = currentElement;
            size++;
        }
    }


    public void pop() {
        StackElement <T> newFirst = first.getNext();
        System.out.println("Элемент " + first.getValue() + " удален");
        first = newFirst;
        size--;
    }

    public void print() {
        StackElement<T> currentElement = first;
        while (currentElement != null) {
            System.out.println(currentElement.getValue());
            currentElement = currentElement.getNext();
        }
    }

}

