import java.util.Scanner;
public class Subprograms {
//	public static void 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("What is the first string:");
		String boi = in.next();
		System.out.println("What is the second string:");
		String bruv = in.next();
		System.out.println(combine(boi,bruv));
	}
	public static String combine(String s1,String s2) {
		String cake = "";
		for (int i=0; i<Math.max(s1.length(),s2.length()); i++) {
			if(i<s1.length()) {
				cake+=s1.charAt(i);
			} 
			cake+=s2.charAt(i);
		}
		return cake;
		
	}
}
