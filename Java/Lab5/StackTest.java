import javax.swing.JOptionPane;

public class StackTest {
    public static void main(String[] args) {
        String choice;
        int ch = 0;
        Student e;
        Object obj;
        
        //ArrayStack stack = new ArrayStack();
        
        LinkedStack stack = new LinkedStack();
        while(ch != 8){
            try{
                choice = JOptionPane.showInputDialog(null,
                        "----------------------------------------------------------------\n" +
                        "                              Menu                              \n" +
                        "----------------------------------------------------------------\n" +
                        "1. Push\n" +
                        "2. Pop\n" +
                        "3. Top\n" +
                        "4. Clear\n" +
                        "5. Exit\n" +
                        "----------------------------------------------------------------\n");
                ch = Integer.parseInt(choice);
                switch (ch) {
                    case 1:
                        e = getElement();
                        obj=e;
                        stack.push(obj);
                        break;
                    case 2:
                        obj = stack.pop();
                        e = (Student)obj;
                        printElement(e);
                        break;
                    case 3:
                        obj = stack.top();
                        e = (Student)obj;
                        printElement(e);
                        break;
                    case 4:
                        stack.clear();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "See ya~");
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice");
                        break;
                }
            }
            catch (Exception o)
            {
                JOptionPane.showMessageDialog(null, o.getMessage());
                System.exit(0);
            }
        }
    }

        public static Student getElement(){
            Student temp;
            String idS = JOptionPane.showInputDialog(null,"Please input ID: ");
            String nameS = JOptionPane.showInputDialog(null,"Please input name: ");
            double midS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Midterm score: "));
            double finalS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Final score: "));
            double quizS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Quiz score: "));
            double prjS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Project score: "));
            double collabS = Double.parseDouble(JOptionPane.showInputDialog(null,"Please input Collaboration score: "));
            temp = new Student();
            temp.setStudent(idS, nameS, midS, finalS, quizS, prjS, collabS);
            return temp;
        }
    
        public static void printElement(Student e){
            if (e != null){
                JOptionPane.showMessageDialog(null,
                "ID : " + e.getId() +
                "\n Name : " + e.getName() +
                "\n Midterm Score : " + e.getMidScore() +
                "\n Final Score : " + e.getFinalScore() +
                "\n Quiz Score : " + e.getQuizScore() +
                "\n Project Score : " + e.getPrjScore() +
                "\n Collaboration Score : " + e.getCollabScore()
                );
            }
            else
                JOptionPane.showMessageDialog(null, "No element");
        }

    
    }

