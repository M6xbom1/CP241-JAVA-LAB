public class StudentArray implements StudentADT{

    Student [] allStudent;
    int totalStd;
    int current;
    Stat statADT;

    StudentArray(){
        allStudent = new Student[100];
        totalStd = 0;
        current = 0;
    }

    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return totalStd >= 0;
    }

    @Override
    public boolean full() {
        // TODO Auto-generated method stub
        return totalStd > allStudent.length;
    }

    @Override
    public Student getCurrentStudent() {
        // TODO Auto-generated method stub
        return allStudent[current++];
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

    @Override
    public void setCurrentStudent(Student std) {
        // TODO Auto-generated method stub
        allStudent[totalStd]=std;
        totalStd++;

        statADT = new Stat();
        for (int x=0;x<totalStd;x++){
            statADT.setData(allStudent[x].getTotalScore());

        }
        
    }
    
}
