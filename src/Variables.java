import java.util.Scanner;
public class Variables {
//	public static void 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("please put in an integer:");
		int boi=in.nextInt();
		System.out.println("please put in a double:");
		double bruv= in.nextDouble();
		System.out.println("please put in a string:");
		String asdf= in.next();
		int bruvi = (int)Math.round(bruv);
		int temp;
		temp = bruvi;
		bruvi = boi;
		boi = temp;
		String cake = asdf.toUpperCase();
		String doi= cake.substring(0, 3);
		String goi= cake.substring(3, (cake.length()));
		System.out.println("Your rounded double: \n"+ boi );
		System.out.println("Your integer: \n"+ bruvi);
		System.out.println("Your uppercased string: ");
		System.out.println(doi);
		System.out.println(goi);
		
		
	}

}
