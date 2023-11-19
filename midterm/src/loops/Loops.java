package loops;
import java.util.Scanner;
public class Loops
{
	
	  public static void main(String[] args)
	  {
	        Scanner keyboard = new Scanner(System.in);
	        System.out.print("Enter any integer from 1 to 25: ");
	        int idk = keyboard.nextInt();

	        if(idk == 1) 
	        {
	            System.out.print("*");
	            return;
	        }

	        int output = 0, d = 0;

	        for(int i = 1; i<=idk;i++) 
	        {
	            int f = i;
	            for(int s=1;s<=f;s++) 
	            {
	                System.out.print("*");
	            }
	        System.out.println();

	        if(i == 1 && d == 1)
	            break;
	        if(i == idk - output) 
	        {
	            d = 1;
	            i=i-2;
	            output = output + 1;
	        }
	        }
	  }
}