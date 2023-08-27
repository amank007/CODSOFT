/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	int eng, hin, math, sci, soSci,comp;
	float percentage, total;
	System.out.println("Enter marks of English: ");
	eng = sc.nextInt();
	System.out.println("Enter marks of Hindi: ");
	hin = sc.nextInt();
	System.out.println("Enter marks of Math: ");
	math = sc.nextInt();
	System.out.println("Enter marks of Science: ");
	sci = sc.nextInt();
	System.out.println("Enter marks of Social Science: ");
	soSci = sc.nextInt();
	System.out.println("Enter marks of Computer: ");
	comp = sc.nextInt();
	total = eng+hin+math+sci+soSci+comp;
	System.out.println("Your Total Marks are " +total + " out of 600" );
	percentage = (total / 600) * 100;
	System.out.println("Your percentage is " +percentage);
	if(percentage>= 90 && percentage<=100  ) {
	    System.out.println("Your grade is A");
	    
	}
	else if(percentage>=80){ System.out.println("Your grade is B");
	}
	else if(percentage>=70) {
	    System.out.println("Your grade is c");
	    
	}
	else {
	    System.out.println("Your grade is D");
	}
}
}
