public class Node {
    private int value;
    protected Node next;
    protected Node previous;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public Node(){}
    public Node(int value){
        setValue(value);
    }
}
