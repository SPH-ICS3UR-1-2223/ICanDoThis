import java.util.Random;
public class Repetition {
//	public static void 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random boi= new Random();
		int boi_in1 = boi.nextInt(10);
		int bruv_in1 = boi.nextInt(10);
		int cake_in1 = boi.nextInt(10);
		String sour = (boi_in1 +","+bruv_in1+ ","+cake_in1);
	
		int count=0;
		int boii_in1, bruvi_in1, cakei_in1;
		do {
			
			boii_in1 = boi.nextInt(10);
			
			bruvi_in1 = boi.nextInt(10);
			
			cakei_in1 = boi.nextInt(10);
			count++;
		}while(boi_in1!=boii_in1|| bruv_in1!=bruvi_in1 || cake_in1!=cakei_in1);
		System.out.println("It took: "+count+" tries");
		}
		
	}


