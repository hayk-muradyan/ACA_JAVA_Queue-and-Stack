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
        if(this.peek != null)
            return this.peek;
        return null;
    }
    public Node Pop(){
        if(peek == null)
            return null;
        else if(peek.previous == null){
            peek = null;
            return null;
        }
        Node temp = peek;
        peek.previous.next = null;
        peek = peek.previous;
        return temp;
    }
}
