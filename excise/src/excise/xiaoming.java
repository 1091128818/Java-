package excise;

import java.util.Scanner;

public class xiaoming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++) {
		System.out.println("�Ӽ�������С���ĳɼ���");
		Scanner s=new Scanner(System.in);
		int Score=s.nextInt();
		//s.close();
		if(Score<0||Score>100) {
			System.out.println("������������������");
		}
		else if(Score==100) {
			System.out.println("һ̨BMW��Ϊ����");
		}
		else if(Score<=99&&Score>80) {
			System.out.println("һ̨vivo");
		}
		else if(Score<=80&&Score>60) {
			System.out.println("һ����");
		}
		else {
			System.out.println("����һ��");
		}
		
	}
	}

}
