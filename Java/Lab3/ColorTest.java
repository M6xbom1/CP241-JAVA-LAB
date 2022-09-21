import javax.swing.*;

public class ColorTest {
    public static void main(String args[]) {
        char choice;
        String inpStr;
        MyColor.ColorsEnum color1, color2;
        MyColor.ColorsEnum color3[] = new MyColor.ColorsEnum[2];
        MyColor mixColor = new MyColor(MyColor.ColorsEnum.RED);
        MyColor pColor = new MyColor(MyColor.ColorsEnum.RED);
        MyColor formColor = new MyColor(MyColor.ColorsEnum.RED);
        MyColor assignColor = new MyColor(MyColor.ColorsEnum.RED);
        choice = 0;
        while (choice != '9') {

            boolean result1 , result2;
            inpStr = JOptionPane.showInputDialog(null, "Test operations of ADT Color\n" +
                    "1. Mix\n" +
                    "2. Primary\n" +
                    "3. Form\n" +
                    "4. Assign\n" +
                    "9. Quit");
            choice = inpStr.charAt(0);

            if (choice == '1') {// mix colors
                color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter the First Color"));
                result1 = pColor.primary(color1);
                while (result1 == false) {
                    color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Colors"));

                }
                color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter The Second Color"));
                result2 = pColor.primary(color2);
                while (result2 == false) {
                    color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Colors"));
                }
                System.out.println(mixColor.mix(color1, color2));
            } else if (choice == '2') {// primary colors
                color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter The Primary Color"));
                if (pColor.primary(color1) == true) {
                    System.out.println("This color is primary.");
                } else {
                    System.out.println("This color is not primary.");
                }
            } else if (choice == '3') {// secondary colors
                color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter The Color"));
                while (formColor.primary(color1) == true) {
                    color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Color! Enter the color that is not primary:"));
                }
                color3 = formColor.form(color1);
                System.out.print(color3[0] + " " + color3[1] + " that formop the color " + color1);
            } else if (choice == '4') {// assign colors
                color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter The First Color"));
                result1 = pColor.primary(color1);
                while (result1 == false) {
                    color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Colors"));
                }
                color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter The Secend Color"));
                result2 = pColor.primary(color2);
                while (result2 == false) {
                    color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Colors"));
                }
                color1 = assignColor.assign(color2);
                System.out.println("The first color was assign to " + color1);
            } else if (choice == '9') {
                System.out.println("\nGoodbye\n");
            } else {
                System.out.println("\nPlease select a choice from the menu.\n");
            }

        }
    }
}
