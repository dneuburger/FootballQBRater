import java.util.Scanner;
import java.lang.Math;

public class FootballQBRater {

	public static void main(String[] args) {
		//allows inputs to work
		Scanner input = new Scanner(System.in);
		
		//prompts users to input values for the variables
		System.out.print("Number of passing attempts: ");
		double ATT = input.nextDouble();
		System.out.print("Number of completions: ");
		double COMP = input.nextDouble();
		System.out.print("Passing yards: ");
		double YDS = input.nextDouble();
		System.out.print("Touchdown passes: ");
		double TD = input.nextDouble();
		System.out.print("Interceptions: ");
		double INT = input.nextDouble();
		
		//Preliminary Calculations
		double a = ((COMP/ATT)-.3)*5;
		double b = ((YDS/ATT)-3)*.25;
		double c = (TD/ATT)*20;
		double d = 2.375-(INT/ATT)*25;
		
		//Final Calculation
		double Passer_Rating = ((a+b+c+d)/6)*100;
		
		//Rounding and Display
		System.out.println("The QB Rating is: ");
		System.out.printf("%.1f", Passer_Rating);
	}

}
