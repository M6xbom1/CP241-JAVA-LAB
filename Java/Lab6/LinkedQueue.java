public class LinkedQueue implements QueueADT{

    Object e;
    MyNode head = null;
    MyNode tail = null;
    int size;

    public LinkedQueue(){
        Queue();
    }

    @Override
    public void Queue() {
        head = tail = null;
        size = 0;
    }

    @Override
    public void clear() {
        head = tail = null;
    }

    @Override
    public Object dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        else{
            if(head == tail){
                head = tail = null;
            }
            else{
                head = head.getNextNode();
            }
            size--;
            return head.getData();
        }
    }

    @Override
    public void enqueue(Object e) throws Exception {
            MyNode newNode = new MyNode(e);
            if(isEmpty()){
                head = newNode;
                tail = newNode;
                size++;
            }
            else{
                tail.setNextNode(newNode);
                tail = newNode;
                size++;
            }
        }

    @Override
    public boolean isEmpty() {
        return head == null && tail == null && size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int lenght(){
        return size;
    }

    @Override
    public Object front()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        else{
            return head.getData();
        }
    }
    
}
