interface MyStack {
    public  void MyStack();

    public void push(Object e) throws Exception;

    public Object pop() throws Exception;

    public Object top() throws Exception;

    public boolean empty();

    public boolean full();

    public void clear();
}
