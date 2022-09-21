public class ArrayQueue implements QueueADT{
    private int front,rear;
    private int total;
    private Object s[];

    public ArrayQueue(){
        Queue();
    }

    @Override
    public void Queue() {
        front = -1;
        rear = -1;
        total = 3;
        s = new Object[total];
    }

    @Override
    public void clear() {
        front = -1;
        rear = -1;
    }

    @Override
    public Object dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        else{
            front = front + 1;
            return s[front];
        }
    }

    @Override
    public void enqueue(Object e) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }
        else{
            rear++;
            s[rear] = e;
        }
    }

    @Override
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    @Override
    public boolean isFull() {
        return rear == total-1;
    }

    @Override
    public int lenght() {
        return rear - front;
    }

    @Override
    public Object front()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        else{
            return s[front+1];
        }
    }
    
}
