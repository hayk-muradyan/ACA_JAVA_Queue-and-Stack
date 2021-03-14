public class Main {
    public static void main(String[] args){
        Queue que = new Queue();
        que.Add(1);
        que.Add(2);
        que.Add(3);
        que.Add(4);
        que.Add(5);
        que.Add(6);
        que.Add(7);
        que.Add(8);
        System.out.println(que.Peek().getValue());
        System.out.println(que.Pull().getValue());
        System.out.println(que.Peek().getValue());

        Stack stk = new Stack();
        stk.Push(1);
        stk.Push(2);
        stk.Push(3);
        stk.Push(4);
        stk.Push(5);
        stk.Push(6);
        stk.Push(7);
        stk.Push(8);
        System.out.println(stk.Peek().getValue());
        System.out.println(stk.Pop().getValue());
        System.out.println(stk.Peek().getValue());
    }
}
