import javax.swing.*;
import java.text.DecimalFormat;
class TestStudentADT{
    static StudentADT data;
    static int total;
    static Student std;

    public static void main(String[] args) {
        total = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of Student :"));
        
        data = new StudentArray();
        //data = new StudentLinkedList();
        readData();
        printTable();
    }

    public static void readData(){
        String id,name;
        double mid,fin,quiz,prj,col;
        for(int i=0; i<total; i++){
            id = JOptionPane.showInputDialog(null,"Input ID of student."+(i+1));
            name = JOptionPane.showInputDialog(null,"Input Name of student."+(i+1));
            mid = Double.parseDouble(JOptionPane.showInputDialog(null,"Input Midterm Score of student."+(i+1)));
            fin = Double.parseDouble(JOptionPane.showInputDialog(null,"Input Final Score of student."+(i+1)));
            quiz = Double.parseDouble(JOptionPane.showInputDialog(null,"Input Quiz Score of student."+(i+1)));
            prj = Double.parseDouble(JOptionPane.showInputDialog(null,"Input Project Score of student."+(i+1)));
            col = Double.parseDouble(JOptionPane.showInputDialog(null,"Input Collab Score of student."+(i+1)));
            std = new Student(id,name,mid,fin,quiz,prj,col);
            data.setCurrentStudent(std);
        }
    }

    public static void printTable(){
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0;i<total;i++){
            std = data.getCurrentStudent();
            System.out.println("  ID: "+std.getId()+" Name: "+std.getName()+" Mid-score: "+df.format(std.getMidScore())+" Final-score: "+df.format(std.getFinalScore())+" Quiz-score: "+
            df.format(std.getQuizScore())+" Collaboration-score: "+df.format(std.getCollabScore())+" Project-score: "+df.format(std.getPrjScore())+" Total-score: "+df.format(std.getTotalScore())+"\n");
        }
        System.out.println("Statistics\n"+"Max: "+data.getMax()+"\nMin: "+data.getMin()+"\nMean: "+df.format(data.getMean())+"\nSD: "+df.format(data.getSD())+"\nTotal: "+data.getTotal());
    }
}