package excise;

public class TestSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=10,i2=20;
		int i=i1++;//��ȡֵ�������� i1=10 i=i1++ 
		System.out.print("i="+i);//i=10 ����ȡֵ
		System.out.println("i1="+i1);//i1=11����������κ�i=11
		i=++i1;
		System.out.print("i="+i);//������i=12
		System.out.println("i1="+i1);//��ȡֵi1=12
		i=i2--;
		System.out.print("i="+i);//i=20��ȡֵ
		System.out.println("i2="+i2);//������i1=19
		i=--i2;
		System.out.print("i="+i);//������i=18
		System.out.println("i2="+i2);//��ȡֵi1=18
	}

}
