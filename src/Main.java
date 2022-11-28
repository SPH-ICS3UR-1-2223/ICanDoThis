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
		nums= rnd;
		for (int i=0;i<nums.length;i++) {
//			nums=rnd.nextDouble(size);
			System.out.print(nums);
		}
	
		
		for (double i = 0; i < nums.length; i++) {
//			double[i]=
			
		}


	}

}
