package excise;

public class TestSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=10,i2=20;
		int i=i1++;//先取值，后运算 i1=10 i=i1++ 
		System.out.print("i="+i);//i=10 即先取值
		System.out.println("i1="+i1);//i1=11即后运算这次后i=11
		i=++i1;
		System.out.print("i="+i);//先运算i=12
		System.out.println("i1="+i1);//后取值i1=12
		i=i2--;
		System.out.print("i="+i);//i=20先取值
		System.out.println("i2="+i2);//后运算i1=19
		i=--i2;
		System.out.print("i="+i);//先运算i=18
		System.out.println("i2="+i2);//后取值i1=18
	}

}
