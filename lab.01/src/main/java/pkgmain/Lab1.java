package pkgmain;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.*;

public class Lab1 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input =  new Scanner(System.in);
		
		/* I have decided to assign easy letter symbols to the variables that I would use:
		 yw == years to work;
		 ar == annual return on investment;
		 yr == years to retire;
		 rr == return rate on retirement savings;
		 ir == retirement income;
		 SSI == Social Security Income
		 */
		
		//Ask user how many years he is planning to work
		System.out.print(
				"Enter the amount of years you are willing to work in 'double' type:");
		double yw = input.nextDouble();
		
		//Ask user about what annual return he expects
		System.out.print(
				"Please, indicate what annual return on your investment you expect:");
		double ar = input.nextDouble();
		
		//Ask user for how many years he is planning on being retired
		System.out.print(
				"Enter the amount of years that you are planning on being retired:");
		double yr = input.nextDouble();
		
		//Ask user about the annual return rate on his retirement savings
		System.out.print(
				"Please, indicate what is the retirement return rate on your savjngs you expect:");
		double rr = input.nextDouble();
		
		//Ask user about his required income while he's at retirement
		System.out.print(
				"Please, indicate what income you would require when you are retired:");
		double ir = input.nextDouble();
		
		//Ask user about his expected SSI
		System.out.print(
				"Enter the amount of SSI that you expect:");
		double SSI = input.nextDouble();
		
		double y = ir - SSI;
		
		double TotalSave = FinanceLib.pv(rr/1200, yr*12, y, 0, false);
		System.out.print("You will have saved the following ammount: $");
		System.out.printf("%.2f",TotalSave*(-1));
		System.out.println("");
		
		double monthlyIncome = FinanceLib.pmt(ar/1200,yw*12,0,TotalSave,false);
		System.out.print("You will receive the following amount per month: $");
		System.out.printf("%.2f",monthlyIncome);
		
	}

}
