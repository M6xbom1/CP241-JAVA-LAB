public class CircularArrayQueue implements QueueADT{
    private int front,rear;
    private int total;
    private Object s[];

    public CircularArrayQueue(){
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
            front++;
            return s[front];
        }
    }

    @Override
    public void enqueue(Object e) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }
        else{
            rear = (rear+1)%total;
            s[rear] = e;
            if(front == -1){
                front = 0;
            }
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
        if (isEmpty()) {
            return 0;}
        else{
            return rear-front+1;
        }
    }

    @Override
    public Object front()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        else{
            return s[front];
        }
    }
    
}
