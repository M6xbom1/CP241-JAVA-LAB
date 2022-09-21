import java.util.ArrayList;

public class Stat2 implements StatADT {

private ArrayList<Double> number = new ArrayList<Double>();

// private int total = 0;

@Override
public void setData(int element, double input) {
    // TODO Auto-generated method stub 
    if (element >= number.size()){
        number.add(input);
    }
    else{
        number.set(element, input);
    }
}

@Override
public void setTotal(int t) {
    // TODO Auto-generated method stub
    
}

@Override
public double getData(int element) {
    // TODO Auto-generated method stub
    return number.get(element);
}

@Override
public int getTotal() {
    // TODO Auto-generated method stub
    return number.size();
}

@Override
public double getMean() {
    // TODO Auto-generated method stub
    double sum;
    sum = 0;
    for(int i = 0; i < number.size(); i++)
    {
        sum += number.get(i);
    }
    return sum/(double) number.size();
}

@Override
public double getSD() {
    // TODO Auto-generated method stub
    double sum = 0;
    double mean = getMean();
    for(int i = 0; i < number.size(); i++)
    {
        sum += (number.get(i) - mean) * (number.get(i) - mean);
    }
    return Math.sqrt(sum/(double) number.size());
}

@Override
public double getMax() {
    // TODO Auto-generated method stub
    double max = number.get(0);
    for(int i = 0; i < number.size(); i++)
    {
        if(number.get(i) > max)
        {
            max = number.get(i);
        }
    }
    return max;
}

@Override
public double getMin() {
    // TODO Auto-generated method stub
    double min = number.get(0);
    for(int i = 0; i < number.size(); i++)
    {
        if(number.get(i) < min)
        {
            min = number.get(i);
        }
    }
    return min;
}

@Override
public void setData(double input) {
    // TODO Auto-generated method stub
    
}
    
}
