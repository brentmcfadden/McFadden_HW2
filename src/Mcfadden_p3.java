import java.util.Scanner;

public class Mcfadden_p3 {

	private static int responses[][];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String topics[] = null;
		responses = null;
		int i = 0;
		int j = 0;
		int big = 0, small = 0 ,total = 0;
		int t0 = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0;
		topics[0] = "How important is it that there are only two political parties?";
		topics[1] = "How important is your Rank number in videogames that you play competitively?";
		topics[2] = "How important is Italian Cusiine to you?";
		topics[3] = "How important is the UCF parking situation for you?";
		topics[4] = "How important is it go outside for you?";
		
		for(i = 0; i < 5;i++)
			for(j = 0; j < 10; j++)
			{
				responses[i][j] = sc.nextInt();
			}
		
		for(i = 0; i < 5;i++)
		{
			total = 0;
			for(j = 0; j < 10; j++)
			{
				total = total + responses[i][j];
			}
			
			total = total / 10;
			if(i == 0)
				t0 = total;
			else if(i == 1)
				t1 = total;
			else if(i == 2)
				t2 = total;
			else if (i == 3)
				t3 = total;
			else if(i == 4)
				t4 = total;
		}
		// big
		if(t0 > t1)
		{
			if(t0 > t2)	
				if(t0 > t3)
					if(t0 > t4)
						big = t0;
		}
		else if(t1 > t0)
		{
			if(t1 > t2)
				if(t1 > t3)
					if(t1 > t4)
						big = t1;
		}
		else if(t2 > t0)
		{
			if(t2 > t1)
				if(t2 > t3)
					if(t2 > t4)
						big = t2;
		}
		else if(t3 > t0)
		{
			if(t3 > t1)
				if(t3 > t2)
					if(t3 > t4)
						big = t3;
		}
		else
		{	
			big = t4;
		}
		// small
		if(t0 < t1)
		{
			if(t0 < t2)	
				if(t0 < t3)
					if(t0 < t4)
						small = t0;
		}
		else if(t1 < t0)
		{
			if(t1 < t2)
				if(t1 < t3)
					if(t1 < t4)
						small = t1;
		}
		else if(t2 < t0)
		{
			if(t2 < t1)
				if(t2 < t3)
					if(t2 < t4)
						small = t2;
		}
		else if(t3 < t0)
		{
			if(t3 < t1)
				if(t3 < t2)
					if(t3 < t4)
						small = t3;
		}
		else
		{
			small = t4;
		}
		System.out.println("RESULTS:");
		System.out.println(topics[0] + ": " + responses[0][0] + " " + responses[0][1] + " " + responses[0][2] + " " + responses[0][3]+ " " + responses[0][4] + " " + responses[0][5] + " " + responses[0][6] + " " + responses[0][7] + " " + responses[0][8] + " " + responses[0][9] + " " + t0 + " " + big + " " + small);
		System.out.println(topics[1] + ": " + responses[1][0] + " " + responses[1][1] + " " + responses[1][2] + " " + responses[1][3] + " " + responses[1][4] + " " + responses[1][5] + " " + responses[1][6] + " " + responses[1][7] + " " + responses[1][8] + " " + responses[1][9] + " " + t1 + " " + big + " " + small);
		System.out.println(topics[2] + ": " + responses[2][0]+ " " +  responses[2][1] + " " + responses[2][2] + " " + responses[2][3]+ " " + responses[2][4] + " " + responses[2][5] + " " + responses[2][6] + " " + responses[2][7] + " " + responses[2][8] + " " + responses[2][9] + " " + t2 + " " + big + " " + small);
		System.out.println(topics[3] + ": " + responses[3][0]+ " " + responses[3][1]+ " " + responses[3][2] + " " + responses[3][3] + " " + responses[3][4] + " " + responses[3][5] + " " + responses[3][6] + " " + responses[3][7] + " " + responses[3][8] + " " + responses[3][9] + " " + t3 + " " + big + " " + small);
		System.out.println(topics[4] + ": " + responses[4][0] + " " + responses[4][1] + " " + responses[4][2]+ " " + responses[4][3] + " " + responses[4][4] + " " + responses[4][5] + " " + responses[4][6] + " " + responses[4][7] + " " + responses[4][8] + " " + responses[4][9] + " " + t4 + " " + big + " " + small);
	
	}

}
