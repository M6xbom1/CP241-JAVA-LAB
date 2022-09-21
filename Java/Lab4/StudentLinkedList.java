public class StudentLinkedList implements StudentADT {
    MyNode firstNode;
    MyNode lastNode;
    MyNode currentNode,p;
    int totalStd;
    Stat statADT;

    //Constructor
    StudentLinkedList() {
        firstNode = null;
        lastNode = null;
        currentNode = null;
        totalStd = 0;
    }

    public Student getCurrentStudent(){
        MyNode outputNode = currentNode;
        currentNode = currentNode.getNextNode();
        return outputNode.getData();
    }

    public void setCurrentStudent(Student std){
        totalStd++;
        if(empty()){
            statADT = new Stat();
            lastNode = new MyNode(std);
            firstNode = lastNode;
            currentNode = firstNode;
            statADT.setData(currentNode.getData().getTotalScore());
        }
        else{
            lastNode.setNextNode(new MyNode(std));
            lastNode = lastNode.getNextNode();
            statADT.setData(lastNode.getData().getTotalScore());
            
        }
    }

    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return firstNode == null;
    }

    @Override
    public boolean full() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public double getMax() {
        // TODO Auto-generated method stub
        return statADT.getMax();
    }

    @Override
    public double getMean() {
        // TODO Auto-generated method stub
        return statADT.getMean();
    }

    @Override
    public double getMin() {
        // TODO Auto-generated method stub
        return statADT.getMin();
    }

    @Override
    public double getSD() {
        // TODO Auto-generated method stub
        return statADT.getSD();
    }

    @Override
    public double getTotal() {
        // TODO Auto-generated method stub
        return statADT.getTotal();
    }
}
