import java.util.Scanner;
public class Operator {
//	public static void 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = in.nextInt();
		int temp= x;
		x=x-1;
		System.out.println(temp+"-1="+x);
		int boi=x;
		x=x*3;
		System.out.println(boi+"x3="+x);
		int bruv=x;
		x=x+12;
		System.out.println(bruv+"+12="+x);
		int sour=x;
		x=x/3;
		System.out.println(sour+"/3="+x);
		int joke=x;
		x=x+5;
		System.out.println(joke+"+5="+x);
		int boiii=x;
		x=x-temp;
		System.out.println(boiii+"-"+temp+"="+x);
		System.out.println("It's 8!!");
	}

}
