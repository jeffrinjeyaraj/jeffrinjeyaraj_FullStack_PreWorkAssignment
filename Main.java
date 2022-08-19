package PreWorkAssignment;
import java.util.Scanner;
public class Main {
Scanner sc = new Scanner(System.in);
public void checkPalindrome(){
	System.out.println(" Enter the number");
	int num = sc.nextInt();
	int rev = 0 ;
	while(num!=0) {
		int x = num%10 ;
		rev = rev*10 + x ;
		num = num / 10 ;
	}
	System.out.println(" the palindrome number is " +rev);
}
public void printPattern() {
	System.out.println(" Enter the Number ");
	int star = sc.nextInt();
	for(int i = 1 ; i <= star ; i++) {
		for(int j =i ; j <= star ; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public void checkPrime() {
	System.out.println(" Enter the Number ");
	int pr = sc.nextInt();
	int count = 0 ;
	for(int i = 1 ; i <= pr ; i ++) {
	if(pr%i == 0)	{
		count++ ;
	}
	}
	if(count > 2 ) {
	System.out.println(" The Number is not a Prime Number");
	}
	else {
		System.out.println("it is a prime number");
	}
}
public void printFibonacciSeries() {
	int x = 0 , y = 1 ;
	System.out.println(" Enter the length ");
	int fib = sc.nextInt();
	for(int i = 0 ; i < fib ; i ++) {
		if(i == 0) {
			System.out.print("" +x);
	
		}
		else 
		{
			int z = y + x ;
			System.out.print(","+z );
			x=y;
			y = z;
		}
		
		
	}
	System.out.println();
}

public static void main(String[] args) {
	Main obj = new Main();
	int choice;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
				
				+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
			
				+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
		System.out.println();
		choice = sc.nextInt();
		switch(choice) {
		case 0:
			choice = 0 ;
		break;
		case 1:{
			obj.checkPalindrome();
		}
		break;
		case 2: {
			obj.printPattern();
		}
	break;
		case 3: {
			obj.checkPrime();
		}
	break;
		case 4: {
			obj.printFibonacciSeries();
		}
	break;
	
	}
}while(choice!=0);
	System.out.println(" Exited Successfully");
	sc.close();
	}
}