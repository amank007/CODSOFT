/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.lang.Math;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    int loop = 1;
	    while(loop == 1){
	    int score = 0;
	    int number =(int) (Math.random() * 100) ;
	    //	System.out.println(+number);
	   
	   
	    
		System.out.println("Guess The Number You have 5 attempts");
		System.out.println("Hint: It can be between 0 to 100");
		for(int i = 5; i>0; i--)
		{
		   int guess = Sc.nextInt(); 
		   if(guess>number){System.out.println("You Guessed more!!");}
		   else if(guess<number){ System.out.println("You Guessed less!!");}
		   else {System.out.println("Congrats you guessed it right"); score = i; break;}
		   
		}
		System.out.println("Your score is: " +score);
			System.out.println("Press 1 to play again or 0 to exit");
	loop = Sc.nextInt();
	}

	}
}
