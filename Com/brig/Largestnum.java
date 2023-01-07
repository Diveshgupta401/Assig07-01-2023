package Com.brig;

import java.util.Scanner;

public class Largestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a,b,largest = 0;
//Scanner sc =new Scanner (System.in);
System.out.println("Enter the first number");
Scanner sc =new Scanner (System.in);
 int a=sc.nextInt();
System.out.println("Enter the Second number");
int b=sc.nextInt();
System.out.println("Enter the third number");
int c=sc.nextInt();
Largestnum obj =new Largestnum();
obj.islargest(a,b,c);
	}
	
	public void islargest(int a,int b, int c) {
		if (a<b&a<c) {
			System.out.println("numbers are "+b+" and "+c);
		}
		else if (b<a&b<c) {
			System.out.println("numbers are "+a+" and "+c);
		}
		else {
			System.out.println("numbers are "+a+" and "+b);
		}





	}

}
