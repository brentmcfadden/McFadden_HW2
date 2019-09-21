import java.util.Scanner;

public class Mcfadden_p2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert 1 for BMI with Weight in POUNDS and Height in INCHES, or 2 for Weight in KILOGRAMS and Height in METERS");
		int i = sc.nextInt();
		if(i == 1)
		{
			double WeightnP = sc.nextDouble();
			double HeightnI = sc.nextDouble();
			double BMI = 0;
		
			HeightnI = Math.pow(HeightnI, 2);
		
			BMI = (703 * WeightnP) / HeightnI;
			System.out.println("BMI with Weight in Pounds and Height in Inches: " + BMI);

		}
		else if(i == 2)
		{
			double Wk = sc.nextDouble();
			double Hm = sc.nextDouble();
			double BMI = 0;
			
			Hm = Math.pow(Hm, 2);
			
			BMI = Wk/ Hm;
			System.out.println("BMI with Weight in Kilometers and Height in Meters: " + BMI);
		}
		else 
			System.out.println("Failed to press 1 or 2");
	}

}


