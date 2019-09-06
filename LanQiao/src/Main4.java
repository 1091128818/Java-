import java.util.Scanner;
public class Main4 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in );
	 int a = s.nextInt();
	 int x,y,z,sum;
		while(a != 0) {
			z = a/100;
			y =(a - z*100)/10;
			x = a -z*100-y*10;
			sum = x*x*x+y*y*y+z*z*z;	
		if(a==sum) {
			System.out.println("1");
		return;
		}
			else 
				System.out.println("0");
		return;
     }
		
	}

}
