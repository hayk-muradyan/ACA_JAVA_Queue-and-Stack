public class Main {
    public static void main(String[] args){
        Queue que = new Queue();
        que.Add(1);
        que.Add(2);
        que.Add(3);
        que.Add(4);

        que.print(que.Peek());
        que.print(que.Pull());
        que.print(que.Peek());
        que.print(que.Pull());
        que.print(que.Peek());
        que.print(que.Pull());
        que.print(que.Peek());
        que.print(que.Pull());

        Stack stk = new Stack();
        stk.Push(1);
        stk.Push(2);
        stk.Push(3);
        stk.Push(4);

        stk.print(stk.Peek());
        stk.print(stk.Pop());
        stk.print(stk.Peek());
        stk.print(stk.Pop());
        stk.print(stk.Peek());
        stk.print(stk.Pop());
        stk.print(stk.Peek());
        stk.print(stk.Pop());
    }
}
