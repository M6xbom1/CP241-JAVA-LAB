public class ArrayStack implements MyStack{

    private int total = 0;
    private Object s[];
    int top;

    public ArrayStack() {
        top =-1;
        total = 50;
        s = new Object[total];

    }

    @Override
    public void MyStack() {
        // TODO Auto-generated method stub
        top = -1;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        top = -1;
    }

    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return top == -1;
    }

    @Override
    public boolean full() {
        // TODO Auto-generated method stub
        return top == total-1;
    }

    @Override
    public Object pop() throws Exception {
        // TODO Auto-generated method stub
        if(empty()){
            throw new Exception("Stack is empty");
        }else{
            Object temp = s[top];
            top--;
            return temp;
        }
    }

    @Override
    public void push(Object e) throws Exception {
        // TODO Auto-generated method stub
        if(full()){
            throw new Exception("Stack is full");
        }else{
            top++;
            s[top] = e;
        }
        
    }

    @Override
    public Object top() throws Exception {
        // TODO Auto-generated method stub
        if (empty()){
            throw new Exception("Stack is empty");
        }
        return s[top];
    }
    
}
