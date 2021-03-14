public class Node {
    private int value;
    protected Node next;
    protected Node previous;

    public Node(){}
    public Node(int value){
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void print(Node n){
        if(n == null)
            System.out.println("node does not exist");
        else
            System.out.println(n.getValue());
    }

}
