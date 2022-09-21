public class DoubleLinkedList implements ListADT{

    Object e;
    DoubleMyNode first,current;
    int size;

    public DoubleLinkedList(){
        List();
    }

    @Override
    public void List() {
        // TODO Auto-generated method stub
        first=current=null;
        
    }

    @Override
    public void delete() throws Exception {
        // TODO Auto-generated method stub
        DoubleMyNode previous;
        if(isEmpty()){
            throw new Exception("List is empty");
        }else{
            previous=first;
            if(previous==current && current.getNextNode()==null){
                first=current=null;
            }else if(previous==current && current.getNextNode()!= null){
                first=first.getNextNode();
                current=first;
        }else{
            while(previous.getNextNode()!=current){
                previous=previous.getNextNode();
            }
            previous.setNextNode(current.getNextNode());
            current.getNextNode().setPreviousNode(previous);
            current=first;
        }
        }
    }

    @Override
    public void findFirst() throws Exception {
        // TODO Auto-generated method stub
        current=first;
        
    }

    @Override
    public boolean findKey(Object tkey) {
        // TODO Auto-generated method stub
        return this==tkey;
    }

    @Override
    public void findNext() throws Exception {
        // TODO Auto-generated method stub
        current=current.getNextNode();
        
    }

    //@Override
    // public void insert(Object e) throws Exception {
    //     // TODO Auto-generated method stub
    //     DoubleMyNode p = new DoubleMyNode(e,null);
        
    //     if(isEmpty()){
    //         first=current=p;
    //     }else{
    //         p.setNextNode(current.getNextNode());
    //         current.setNextNode(p);
    //         p.setPreviousNode(current);
    //         current.getNextNode().setPreviousNode(p);
    //         current=p;

    //     }
    // }

    

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return first==null;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object retrieve() throws Exception {
        // TODO Auto-generated method stub
        if(isEmpty()){
            throw new Exception("List is empty");
        }else{
            return current.getData();
        }
    }

    @Override
    public void update(Object e) throws Exception {
        // TODO Auto-generated method stub
        if (isEmpty()){
            throw new Exception("List is empty");
        }else{
            current.setData(e);
        }
        
    }

    @Override
    public void insert(Object e) throws Exception {
        // TODO Auto-generated method stub
        DoubleMyNode p = new DoubleMyNode(e,null);
        
        if(isEmpty()){
            first=current=p;
        }else{
            p.setNextNode(current.getNextNode());
            p.setPreviousNode(current);
            current.setNextNode(p);
            if (p.getNextNode() != null)
                p.getNextNode().setPreviousNode(p);
            current=p;

        }
    }
    
}
