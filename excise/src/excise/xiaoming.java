package excise;

import java.util.Scanner;

public class xiaoming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++) {
		System.out.println("从键盘输入小明的成绩：");
		Scanner s=new Scanner(System.in);
		int Score=s.nextInt();
		//s.close();
		if(Score<0||Score>100) {
			System.out.println("输入有误！请重新输入");
		}
		else if(Score==100) {
			System.out.println("一台BMW作为奖励");
		}
		else if(Score<=99&&Score>80) {
			System.out.println("一台vivo");
		}
		else if(Score<=80&&Score>60) {
			System.out.println("一本书");
		}
		else {
			System.out.println("暴打一顿");
		}
		
	}
	}

}
