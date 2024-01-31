package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("how much amount do you want to put in ?");
		int startAmount = in.nextInt ();
		System.out.println("What is the win chance ?");
		double winChance = in.nextDouble();
		System.out.println("what is your win limit?");
		double winLimit=in.nextDouble();
		System.out.println("number of days you will simulate");
		int totalSimulations = in.nextInt();
		int losses=0;
		
	
		for ( int i=1; i<=totalSimulations; i++)
		{
		int amount = startAmount; 
		int count=0; 
		
		
		while ( amount < winLimit && amount > 0)
	
		{
			double computer = Math.random ();
			if (computer <= winChance) {
				amount++; 
			}else { 
				amount--;
			}
			
			count++ ;
		}
		
		 if (amount == 0) {
			 System.out.println ("Simulation " + i + " " + count + " Lose");
			 losses++; 
		 } else {
			 System.out.println("Simulation " + i + " " + count +" Win");
		 }
		 }
		System.out.println("losses: " + losses);
		System.out.println("Total Simulations " + totalSimulations);
		 }
		

	}

