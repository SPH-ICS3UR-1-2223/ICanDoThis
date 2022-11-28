import java.util.Scanner;
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("What's the first value?");
		int boi= in.nextInt();
		System.out.println("What's the second value?");
		int moustache= in.nextInt();
		for(int i=1; i<=moustache; i++) {
			for (int j=1; j<=boi; j++) {
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
	}

}
