package koreait.day09;
import java.util.Scanner;

public class C43_RedpenExam2 {
	 
		public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	int size=5;
	
	MathProblem[] problems = new MathProblem[size];
	
	int ans;// n1 n2 
	
	int cnt=0;
	System.out.println("--------------------------------");
	System.out.println("2�ڸ��� ����");
	System.out.println("--------------------------------");
	System.out.println("����");
	for(int i =0;i<size;i++) {
	
		MathProblem temp = new MathProblem('*');
		temp.makeProb();  // n1,n2 ���� �ļ�
		//System.out.print("����" + (i+1) +"." + temp.getN1() + "+" + temp.getN2()+ "= >>>");
		System.out.print("����" + (i+1) +"." + temp.problem() + "= >>>");
		
		ans = sc.nextInt();
		if(ans == temp.showAnswer()){//���� �ټ� 
		cnt++;
		temp.setCrrect(true);
		}
		problems[i] = temp;
	}
	System.out.println("-------------------------------------");
	System.out.println("�����ټ� " + cnt + "(" + cnt*100/size+ "��" );
	System.out.println("::::::::Ʋ������ ���� ����:::::::::::::::");
//	for(int  i=0;i<problems.length;i++)
//		//if(problems[i].isCrrect()==false)
//	      if(!problems[i].isCrrect())
//	System.out.println("����" +(i+1)+ ". " + problems[i].problem() + problems[i].showAnswer());
	//for each  �� ǥ��
	for(MathProblem temp:problems)
		if(!temp.isCrrect())
			System.out.println(temp.problem() + temp.showAnswer());
	
	sc.close();
}
}
