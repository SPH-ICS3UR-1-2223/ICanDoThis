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

		for (int i=0;i<nums.length;i++) {
			System.out.print("Enter a number:");
			nums[i]=in.nextDouble();
			double total = nums[i];
			total=total+nums[i];
			System.out.println(total);
		}
		Arrays.sort(nums);
		System.out.println("Min:" +nums[0] );
		System.out.println("Max:" +nums[nums.length-1] );
		double ave= (nums[nums.length+1]);
		System.out.println("Average:"+ ave);
			
		}


	}


