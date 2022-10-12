package lab8;

import javax.swing.*;
class ListTest 
{
	
	public static void main(String[] args) throws Exception
	{
		String choice , choice2;
		int ch = 0 ,ch2 = 0;
		int e;
		ListTest test = new ListTest();
		Object obj;

		ArrayList list = new ArrayList();
		while(ch != 10)
		{
		try{
			choice = JOptionPane.showInputDialog(null,
				" ---------------------------------- \n"+
				"                          Menu \n"+
				" ---------------------------------- \n"+
				"        1. Insert\n"+
				"        2. Retrieve\n"+
				"        3. Delete \n"+
				"        4. Update \n"+
				"        5. Find First \n"+
				"        6. Find Next \n"+
				"        7. Find Key \n"+
				"        8. Sort    \n"+
				"        9. PrintAll \n"+
				"        10. Exit \n"+
				" ----------------------------------\n");
			ch = Integer.parseInt(choice);
			switch (ch)
			{
			case 1:
						//e = test.getElement(); //Manual
						//list.insert(e);

						list.insert(67);       //Fixed
						list.insert(32);
						list.insert(75);
						list.insert(68);
						list.insert(58);
						list.insert(55);
						list.insert(90);
						list.insert(35);
						list.insert(40);
						list.insert(83);
						break;
			case 2:
						obj = list.retrieve();
						e = (Integer) obj;
						test.printElement(e);
						break;
			case 3:
						list.delete();
						break;

			case 4:
						e = test.getElement();
						obj=e;
						list.update(e);
						break;

			case 5:
						list.findFirst();
						obj = list.retrieve();
						e = (Integer) obj;
						test.printElement(e);
						break;

			case 6:
						list.findNext();
						obj = list.retrieve();
						e = (Integer) obj;
						test.printElement(e);
						break;

			case 7:
						e = test.getElement();
						obj=e;
						if (list.findkey(e))
								JOptionPane.showMessageDialog(null,"Found "+list.retrieve());
						else
								JOptionPane.showMessageDialog(null,"Not Found");
						break;

			case 8:     
						try{
							choice2 = JOptionPane.showInputDialog(null,
						"1.BubbleSort\n"+
						"2.SelectionSort\n"+
						"3.InsertionSort\n"+
						"4.QuickSort\n"+
						"5.Back");
						ch2 = Integer.parseInt(choice2);
						switch (ch2){
							case 1:
								list.bubbleSort();
								break;
							case 2:
								list.selectionSort();
								break;
							case 3:
								list.insertionSort();
								break;
							// case 4:
							// 	list.quickSort();
							// 	break;
							case 5:
								break;

						}

						}catch(Exception ex){
							JOptionPane.showInternalMessageDialog(null, ex.getMessage());
						}

						// list.Sort();
						break;

			case 9:
						list.findFirst();
						for(int i = 0;i<list.getSize();i++)
						{
								System.out.print(list.retrieve()+" ");
								list.findNext();
						}
						System.out.print("\n");
						break;
			case 10:
						JOptionPane.showMessageDialog(null,
								"----------End Program ----------",
								"Quit",
								JOptionPane.INFORMATION_MESSAGE);
						break;
			default :
						JOptionPane.showMessageDialog(null,
								"Not a correct choice, try again",
								"Error",
								JOptionPane.ERROR_MESSAGE);
						break;

			}
		}catch (Exception err){
				JOptionPane.showMessageDialog(null,err.getMessage());
		}

		}
		
	}
		
	public int getElement()
	{
		int temp = Integer.parseInt(JOptionPane.showInputDialog(null,"Please input number :"));
		return temp;
	}
	public void printElement(int e)
	{
			JOptionPane.showMessageDialog(null,e	);	
	}

}
