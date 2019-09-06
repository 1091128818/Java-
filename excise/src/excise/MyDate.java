package excise;

class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate(int d,int m,int y) {
		// TODO Auto-generated constructor stub
		day=d;
		month=m;
		year=y;
	}
	public void display() {
		System.out.println(year+"-"+month+"-"+day);
	}
}
