import java.util.Scanner;
public class Hcf
{	
	static int i ;
	static int j;
	
	int dividend;
	int divisor;
		
	public void divide (int dividend, int divisor)
	{
		
		int remainder = dividend % divisor;
		if (remainder !=0)
		{
			dividend = divisor;
			divisor = remainder;
			divide(dividend,divisor);
		}
		else{
			
			System.out.println("Hello!! Deeksha and Adit; Your HCF is : " + divisor);
			
		}
		
	}
	
	public static void main (String[] args)
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Number");
			i= sc.nextInt();
			System.out.println("Enter Second Number");
			j= sc.nextInt();
			
			Hcf h = new Hcf();
			if (i>j)
			{
			h.dividend = i;
			h.divisor = j;
			}
			else 
			{
			h.dividend = j;
			h.divisor = i;
			}
			h.divide(h.dividend,h.divisor);
			
		}
	
	
}