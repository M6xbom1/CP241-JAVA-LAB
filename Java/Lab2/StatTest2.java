import javax.swing.*;

public class StatTest2 {

    public static void main(String[] args) {

        int total;
        int number = 0;
        Stat2 statAdt = new Stat2();
        total = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of elements: "));
        for (int i = 0; i < total; i++) {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number: "));
            statAdt.setData(i, number);
        }
        statAdt.setTotal(total);
        System.out.println();
        System.out.println("Input data are:");
        for (int j = 0; j < statAdt.getTotal(); j++) {
            System.out.print(statAdt.getData(j) + "\n");
        }
        System.out.println("\n");
        System.out.format("%-15s %3d number is %6.1f \n", "Mean of these", statAdt.getTotal(), statAdt.getMean());
        System.out.format("%-15s %3d number is %6.1f\n", "Max of these", statAdt.getTotal(), statAdt.getMax());
        System.out.format("%-15s %3d number is %6.1f\n", "Min of these", statAdt.getTotal(), statAdt.getMin());
        System.out.format("%-15s %3d number is %6.1f\n", "SD of these", statAdt.getTotal(), statAdt.getSD());

    }

}
