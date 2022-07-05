import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		int rev=0;
		while (num>0)
		{
			int t=num%10;
			rev=rev*10+t;
			num=num/10;
		}
		System.out.println(rev);
		
		
	}

}
