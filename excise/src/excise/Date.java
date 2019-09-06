package excise;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate[]m;
		m=new MyDate[10];
		for(int i=0;i<10;i++) {
			m[i]=new MyDate(i+1, i+1, 1990+i);
			m[i].display();
		}
	}

}
