import java.util.Scanner;

public class Mcfadden_p1b {

	public static void main(String[] args) {
		// To DECRYPT
		
				Scanner sc = new Scanner(System.in);
				int numInput = sc.nextInt();
				int Ones = numInput % 10;
				int Tens = (numInput / 10) % 10;
				int Hunds = (numInput / 100) % 10;
				int K = (numInput /1000) % 10;
				int tempSwitch = 0;
				
				tempSwitch = K;
				K = Tens;
				Tens = tempSwitch;
				
				tempSwitch = Hunds;
				Hunds = Ones;
				Ones = tempSwitch;
				
				K = K - 7;
				K = Math.abs(K);
				K = K % 10;
				
				Hunds = Hunds - 7;
				Hunds = Math.abs(Hunds);
				Hunds = Hunds % 10;
				
				Tens = Tens - 7;
				Tens = Math.abs(Tens);
				Tens = Tens % 10;
				
				Ones = Ones - 7;
				Ones = Math.abs(Ones);
				Ones = Ones % 10;
				
				K = K * 1000;
				Hunds = Hunds * 100;
				Tens = Tens * 10;
				numInput = K + Hunds + Tens + Ones;
				
				System.out.print(numInput);

	}

}
