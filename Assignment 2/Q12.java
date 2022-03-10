import java.util.*;
class Q12
{
	public static void main(String args[])
	{
		double a,b,c;
		double average;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		average = (a + b + c) / 3;
		System.out.println("average = "+average);
	}
}