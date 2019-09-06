
class gcdlcm{
	int gcd(int m,int n) {
		if(m<n) {
			int temp = n;
			n=m;
			m=temp;
		}
		if(m%n==0) {
			return n;
		}
		else {
			m = m%n;
		}
		return n;
	}
}
public class Main5 {

	public static void main(String[] args) {

	}

}
