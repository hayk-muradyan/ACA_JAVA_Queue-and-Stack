public class Stack extends Node{
    private Node peek;

    public void Push(int val){
        if(peek == null)
            peek = new Node(val);
        else {
            Node temp = peek;
            peek = new Node(val);
            peek.previous = temp;
            peek.previous.next = peek;

        }
    }
    public Node Peek(){
        return this.peek;
    }
    public Node Pop(){
        Node temp = peek;
        peek.previous.next = null;
        peek = peek.previous;
        return temp;
    }
}
