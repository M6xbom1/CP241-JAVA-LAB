public class LinkedStack implements MyStack{

    Object e;
    MyNode top;

    public LinkedStack() {
        MyStack();
    }
    
    @Override
    public void MyStack() {
        // TODO Auto-generated method stub
        top = null;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        top = null;
    }

    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return top == null;
    }

    @Override
    public boolean full() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object pop() throws Exception {
        // TODO Auto-generated method stub
        if(empty()){
            throw new Exception("Stack is empty");
        }else{
            Object temp = top.getData();
            top = top.getNextNode();
            return temp;
        }

        }

    @Override
    public void push(Object e) throws Exception {
        // TODO Auto-generated method stub
        if(full()){
            throw new Exception("Stack is full");
        }else{
            top = new MyNode(e,top);
        } 
        
    }

    @Override
    public Object top() throws Exception {
        // TODO Auto-generated method stub
        if (empty()){
            throw new Exception("Stack is empty");
        }
        return top.getData();
    }
    
}
