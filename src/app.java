

public class app {
    public static void main(String[] args) {
        MyStack <Integer> turn = new MyStack<>();
        turn.push(1);
        turn.push(2);
        turn.push(3);
        turn.pop();

        MyQueue <Double> turn2 = new MyQueue<>();
        turn2.push(1.0);
        turn2.push(2.0);
        turn2.push(3.0);
        turn2.pop();
    }
}
