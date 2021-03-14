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
        return this.peek;
    }
    public Node Pull(){
        Node temp = peek;
        peek.next.previous = null;
        peek = peek.next;
        return temp;

    }
}
