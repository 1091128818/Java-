package excise;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		if(num1>num2) {
			if(num2>num3) {
				System.out.println(num3+","+num2+","+num1);
			}
			else {
				System.out.println(num2+","+num3+","+num1);
			}
		}else {
			if(num1>num3) {
				System.out.println(num3+","+num1+","+num2);
			}
			else {
				System.out.println(num1+","+num3+","+num2);
			}
			
		}
	}

}
