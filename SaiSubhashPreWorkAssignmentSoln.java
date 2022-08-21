
// SaiSubhashPreWorkAssignmentSoln

import java.util.Scanner;

public class SaiSubhashPreWorkAssignmentSoln {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int ProgramTask;
		
		do {
		
		System.out.println("Enter your choice of program task from below list.");
		System.out.println("1. Find palindrome of number.");
		System.out.println("2. Print Pattern for a given no.");
		System.out.println("3. Check whether the no is a  prime number.");
		System.out.println("4. Print Fibonacci series.");
		System.out.println("Enter 0 to Exit");
		
		
		ProgramTask = scanner.nextInt();
		
		switch(ProgramTask) {
		
		case 0:

			ProgramTask = 0;break;
			
		case 1 : System.out.println();
		
System.out.println("Enter a number for palindrome or not");
		
		int number = scanner.nextInt();
		
		int n = number;
		int No = n;
		int s = 0;
		
		while(n > 0) {

		
		int r = n % 10;
		
		n = n/10;
		
		s = (s * 10) + r;
		
		}
	 if (No == s) {
		 System.out.println("palindrome Number.\n");
	 }else
		 System.out.println("Not a Palindrome Number.\n");
		
		break;
		
		case 2 : System.out.println();
		
		System.out.println("Enter Number");
		
		
		int NoOfStars = scanner.nextInt();

		for (int i = 1; i <= NoOfStars; i++) {
			
			for (int j = (NoOfStars); j >= i; j--) {
				
		System.out.print("*");
		
			}
			
		System.out.println();
		
		}
		
		System.out.println();
		
		break;
		
		case 3 : System.out.println();
		
		System.out.println("Enter a number for PrimeNo or not.");
		
		int PrimeOrNonNumber = scanner.nextInt();
		
		int no = 0;
		
		for(int i = 2;i <= (PrimeOrNonNumber - 1);i++ ) {
			
			if (PrimeOrNonNumber % i == 0) {
				
				no = no + 1;
			}
		}
		
		if(no > 0) {
			
			System.out.println(PrimeOrNonNumber + " -> is not a prime No.");
			System.out.println();
		}else {
			System.out.println(PrimeOrNonNumber + " -> is a prime No.");
			System.out.println();
		}
		
		break;
		
		case 4 : System.out.println();
		
System.out.println("Enter a number for Fibonacci series - >");
		
		int Numbers = scanner.nextInt();
		
		int first = 0;
		
		int second = 1;
		
		int addedno = 0;
		
		System.out.print("Fibonacci series - > ");
		System.out.print(addedno + " 1 ");
		
		while(addedno <= Numbers) {
			
			addedno = first + second;
			
			System.out.print(addedno + " ");
			first = second;
			second = addedno;
			
			
		}
		System.out.println("\n");
		
		break;
		
	
		
		default:

			System.out.println("Invalid choice. Enter a valid no.");
			System.out.println();break;
			
		}
		
		}while (ProgramTask != 0);

		System.out.println("Exited Successfully!!!");
		
		scanner.close();
		
	}

}

