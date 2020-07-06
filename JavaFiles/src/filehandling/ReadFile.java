package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/* ****************** Read File for Data *****************/
		File inputFile = new File("src/filehandling/start.txt");
		Scanner sc = new Scanner(inputFile);
		ArrayList<String> list = new ArrayList<>();
		
		while(sc.hasNextLine()){
			list.add(sc.nextLine());
		}
		
		//Iterates and Prints out ArrayList
		
		/*System.out.println("The list is: \n" + list);
		Iterator<String> iterate = list.iterator();
		System.out.println("\n The iterated values are: ");
		while(iterate.hasNext()) {
			System.out.println(iterate.next() + " ");
		}*/
		
		//Adds all list members into a Set and checks for any duplicates
		//If any, it iterates & prints them
		
		/*Set<String> set = new TreeSet<>();
		for(int i = 0; i < list.size(); i++) {
			if (set.contains(list.get(i))){ System.out.println(list.get(i) + " is duplicated"); }
			else set.add(list.get(i));
		}
		Iterator<String> iterate = set.iterator();
		System.out.println("\nThe iterated values are: ");
		while(iterate.hasNext()) {
			System.out.println(iterate.next() + " ");
		}*/
		
		//Reversing words in ArrayList-list and storing into new ArrayList-newList.
		ArrayList<String> newList = new ArrayList<String>();
		for(int i = list.size() - 1; i >= 0; i--) {
			newList.add(list.get(i));
		}
		
		//For each string value in the ArrayList, these lines check if the new LinkedHashMap contains those same values
		//already, if not it adds a new value and key pair (see line 93)
		//If it does then it creates a duplicate value and key pair (See line 92)
		
		HashMap<String, Integer> overFive = new LinkedHashMap<>();
		newList.forEach((string) ->{
			if(overFive.containsKey(string)) {
				overFive.put(string, overFive.get(string) +1);
			}
			else overFive.put(string, 1);
		});
		
		//For each entry into the overFive LinkedHashMap, it checks if the number of its occurrences is greater than 1
		
		for(Entry<String, Integer> entry : overFive.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			if(key.length() > 3 && value > 5) {
				System.out.println(key + " is over 3 characters long & repeated over 5 times");
			}
		}
		
		sc.close();
	}

}
