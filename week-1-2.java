import java.util.Scanner;
public class QE{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=0;
		System.out.println("enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("enter the value of b: ");
		int b=sc.nextInt();
		System.out.println("enter the value of c: ");
		int c=sc.nextInt();
		if(a>0){
			x=solveEq(a,b,c);
			System.out.println("the value of x is: "+x);
			}
		else   {
			System.out.println("it is not quadratic equation");
			}
		}
		public static int solveEq(int a,int b,int c){
			int s=-b+sq(a,b,c);
			int t=-b-sq(a,b,c);
			s=s/2*a;
			t=t/2*a;
			if(comp(s,a,b,c)==0){
				return s;}
			else{
				return t;}}
      		public static int sq(int a,int b,int c){
			int z=b*b;
			int y=4*a*c;
			z=z-y;
			z=(int)Math.sqrt(z);
			return z;}
		public static int comp(int q,int a,int b,int c){
			a=a*q*q;
			b=b*q;
			c=a+b+c;
			return c;}
		}
		



