/*
 1. Create an Array with all student names in the class
2. Randomly select one element from the list
3. Display the Student Name that got selected
4. Display the name of student in a pop-up box or dialog box (Need to add libraries for this)
5. Push your code in Git
6. Create a executable .jar file

Expectation: User will click on a Jar file and it should throw a pop up with the random student name
Extra: How would you make the Students list dynamic without changing the code - Array should be dynamic*/

import javax.swing.JOptionPane;
public class ArraySelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String members[] = {"Abby Truong", "Ahmed Mujtaba","Azeez Olanrewaju", "Deep", "Diming Chu", 
				"Dongshuo Li" ,"Honorine","Jason", "Junyu Liu", "Kelly Liu", "Kinjan", "Kun Li", 
				"Muhammed", "Oaz", "PQ", "Prithviatani", "Richard", "Sahil Sandhu", "Samuel Yang", 
				"Scott Jhou", "Shahbaz", "Shariar", "Shakur", "Shrina", "Siyu Qiu", "Siyu Lei", "Sumid",
				"Tao", "Trivediakshay", "Yan Huang", "Zhao saitong"};
	//	int random = Integer.parseInt(members[(int) Math.random()]);
		String random = members[(int)(Math.random() * 32)]; //0 to 31
		JOptionPane.showMessageDialog(null, random); //pop up box displaying random selection 
		
		
	}

}
