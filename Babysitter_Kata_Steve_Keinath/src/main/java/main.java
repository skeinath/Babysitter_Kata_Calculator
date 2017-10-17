import java.util.Scanner;
import java.util.*;
 
public class main {
 
	public static void main(String[] args) {
		int startTime = 0, bedtime = 0, endTime = 0;
		Scanner input = new Scanner (System.in);
		
		BabysitterCalculator babysitter = new BabysitterCalculator();
		
		System.out.println("What is the start time? (whole number, please)");
		startTime = input.nextInt();
		
		System.out.println("What is the bedtime? (whole number, please)");
		bedtime = input.nextInt();
		
		System.out.println("What is the end time? (whole number, please)");
		endTime = input.nextInt();
		
		System.out.println("Your pay is $" + babysitter.calculateWages(startTime,bedtime,endTime));
		
	}
 
}
