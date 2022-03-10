import java.util.*;
class Q6
{
	public static void main(String args[])
	{
		int a,b,c,d,e,f,g;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		d = a * b;
		e = a - b;
		f = a / b;
		g = a % b;
		System.out.println(a+" + "+b+" = "+c);
		System.out.println(a+" * "+b+" = "+d);
		System.out.println(a+" - "+b+" = "+e);
		System.out.println(a+" / "+b+" = "+f);
		System.out.println(a+" % "+b+" = "+g);
	}
}