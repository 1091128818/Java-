package excise;
class Person{
	//���ԣ����Ա����
	String name;
	int age;
	boolean isMarried;
	//������
	public Person() {}
	public Person(String n,boolean im) {
		name=n;isMarried=im;
	}
	//����������
public void walk() {
	System.out.println("����·");
}
public String display() {
	return "�����ǣ�"+name+",�����ǣ�"+age+",jiehunl"+isMarried;
}
//�����
{
	name="longxing";
	age=18;
	isMarried=true;
}
//�ڲ���
class pet{
	String name;
	float weight;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
