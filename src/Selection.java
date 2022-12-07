import java.util.Scanner;
public class Selection {
//	public static void 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Please state how much you made:");
		int boi= in.nextInt();
		double bruv=0;
		double temp;
		if (boi > 0 && boi <= 49020) {
			bruv= boi*0.15;
			System.out.println("This is how much you owe: \n" +bruv);
		} else if (boi >49020 && boi <= 98040) {
			temp = 49020*0.15;
			//bruv= temp; 
			boi= boi-98040;
			temp += boi*0.205;
			//bruv= bruv +temp;
			System.out.println("This is how much you owe: \n" +temp);
		} else if(boi >98040 && boi <=151978 ) {
			temp = boi*0.15;
			bruv= temp; 
			temp = boi*0.205;
			bruv= bruv +temp;
			temp = boi*0.26;
			bruv = bruv+temp;
			System.out.println("This is how much you owe: \n" +bruv);
		} else if(boi >151978 && boi <=216511 ) {
			temp = boi*0.15;
			bruv= temp; 
			temp = boi*0.205;
			bruv= bruv +temp;
			temp = boi*0.26;
			bruv= bruv+temp;
			temp = boi*0.29;
			bruv= bruv+temp;
			System.out.println("This is how much you owe: \n" +bruv);
		} else if(boi > 216511 ) {
			temp = 49020*0.15;
			bruv= temp;
			temp = (98040-49020)*0.205;
			bruv= bruv +temp;
			temp = (151978-98040)*0.26;
			bruv= bruv+temp;
			temp = (216511-151978)*0.29;
			bruv= bruv+temp;
			temp = (boi-216511)*0.33;
			bruv= bruv+temp;
			System.out.println("This is how much you owe: \n" +bruv);
		}else {
			System.out.println("You sir, are broke. \nhere, take some: \n$9999");
		}
	}

}
