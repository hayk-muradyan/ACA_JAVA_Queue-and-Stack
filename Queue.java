public class Queue extends Node{
    private Node peek;

    public void Add(int val){
        if(peek == null)
            peek = new Node(val);
        else {
            Node temp = peek;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(val);
            temp.next.previous = temp;
        }
    }
    public Node Peek(){
        if(this.peek != null)
            return this.peek;
        return null;
    }
    public Node Pull(){
        if(peek == null)
            return null;
        else if(peek.next == null){
            peek = null;
            return null;
        }
        Node temp = peek;
        peek.next.previous = null;
        peek = peek.next;
        return temp;

    }
}
