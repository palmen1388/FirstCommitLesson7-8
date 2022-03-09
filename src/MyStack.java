public class MyStack {

    private StackElement first;
    protected int size = 0;

    public void push(int value) {
        StackElement newElement = new StackElement(value);
        if (first == null) {
            first = newElement;
            size++;
        } else {
            StackElement currentElement = newElement;
            currentElement.setNext(first);
            first = currentElement;
            size++;
        }
    }


    public void pop() {
        StackElement newFirst = first.getNext();
        first = newFirst;
        size--;
    }

    public void print() {
        StackElement currentElement = first;
        while (currentElement != null) {
            System.out.println(currentElement.getValue());
            currentElement = currentElement.getNext();
        }
    }
}

