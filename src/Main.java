import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rnd=new Random();
		System.out.println("Please put in your name");
		String name = in.next();
		System.out.println("Hi "+name+"!");
		System.out.println("Please put in a number for an array size");
		int size=in.nextInt();
		double[] nums=new double[size];
		double sum =0.0;
		double ave = 0.0;

		for (int i=0;i<nums.length;i++) {
			System.out.print("Enter a number:");
			nums[i]=in.nextDouble();
		}
		for (int i=0; i<nums.length; i++) {
			sum = sum+nums[i];
			
		}
		ave=sum/nums.length;
		Arrays.sort(nums);
		System.out.println("Min:" +nums[0] );
		System.out.println("Max:" +nums[nums.length-1] );
		System.out.println("Average:"+ ave);
	}
	}


