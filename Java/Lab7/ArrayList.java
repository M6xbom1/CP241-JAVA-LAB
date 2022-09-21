public class ArrayList implements ListADT{

    private int total;
    private Object s[];
    int current,size;
    
    public ArrayList() {
        List();
    }

    public void List() {
        current = -1;
        total = 50;
        s = new Object[total];
        size = 0;
    }

    @Override
    public void delete() throws Exception {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            throw new Exception("List is empty");
        }else{
            if(size == 1){ //มีตัวเดียว
                current = -1;
            }else if (current == size - 1){
                current = 0;
            }else {
                for(int i = current; i < size - 1; i++) //ลบตัวท้าย
                        s[i] = s[i+1];
                    current = 0;
                }
                size--;
            }
    }

    @Override
    public void findFirst() throws Exception {
        // TODO Auto-generated method stub
        current = 0;
        
    }

    @Override
    public boolean findKey(Object tkey) {
        // TODO Auto-generated method stub
        return this == tkey;
    }

    @Override
    public void findNext() throws Exception {
        // TODO Auto-generated method stub
        if(size >= current) {
            current++;
        }
    }

    @Override
    public void insert(Object e) throws Exception {
        // TODO Auto-generated method stub
        if(isFull()){
            throw new Exception("List is full");
        } else{
            size++;
            if (size == 1){
                current++;
                s[current] = e;
            }else{
                for(int i=size-1;i>current;i--){
                    s[i] = s[i-1];
                }
                current++;
                s[current] = e;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size == 0;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return size >= total;
    }

    @Override
    public Object retrieve() throws Exception {
        // TODO Auto-generated method stub
        if(isEmpty()){
            throw new Exception("List is empty");
        }
        else{
            return s[current];
        }
    }

    @Override
    public void update(Object e) throws Exception {
        // TODO Auto-generated method stub
        if(isEmpty()){
            throw new Exception("List is empty");
        }
        else{
            s[current] = e;
        }
        
    }
}