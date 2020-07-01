import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(123456789, 50.0, "Muhammed", "manrabs@mail.com", 6086424931L);
		
		 Scanner input = new Scanner(System.in);
	        String selection = "";
	        while(!selection.equals ("x")){
	            
	            System.out.println("Please make your selection");
	            System.out.println("1: Show my Account Balance");
	            System.out.println("2: Make a Deposit");
	            System.out.println("3: Make a Withdrawal");
	            System.out.println("x: Finish the simulation");
	            
	            selection = input.nextLine();
	            System.out.println();
	            
	            if(selection.equals("1")){
	                //show account balance here
	            	account.getBalance();
	            }

	            else if(selection.equals("2")){
	                //call deposit method here
	            	System.out.println("Please enter the amount you'd like to deposit: ");
	            	Scanner input1 = new Scanner(System.in);
	            	int depositAmount = input1.nextInt();
	            	account.deposit(depositAmount);
	            	account.accountInfo();
	            }
	            
	            else if(selection.equals("3")){
	            	System.out.println("Please enter the amount you'd like to withdraw: ");
	            	Scanner input2 = new Scanner(System.in);
	            	int withdrawalAmount = input2.nextInt();
	            	account.withdraw(withdrawalAmount);
	            	account.accountInfo();
	            }
	        }

	}

}
