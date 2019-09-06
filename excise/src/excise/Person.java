package excise;
class Person{
	//属性，或成员变量
	String name;
	int age;
	boolean isMarried;
	//构造器
	public Person() {}
	public Person(String n,boolean im) {
		name=n;isMarried=im;
	}
	//方法，或函数
public void walk() {
	System.out.println("人走路");
}
public String display() {
	return "名字是："+name+",年龄是："+age+",jiehunl"+isMarried;
}
//代码块
{
	name="longxing";
	age=18;
	isMarried=true;
}
//内部类
class pet{
	String name;
	float weight;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
