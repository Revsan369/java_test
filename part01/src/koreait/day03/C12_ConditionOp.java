package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {

	public static void main(String[] args) {
		
		 int korean,math;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("�������� �Է�->");
		 korean = sc.nextInt();
		 
		 System.out.print("�������� �Է�->");
		 math = sc.nextInt();
		 
		 
		 //System.out.println("����л�?" + ((korean>=80 && math>=80)? "�½��ϴ�": "�ƴմϴ�") );
		 
		 if((korean>=80 && math>=80)){
			 System.out.print("�½��ϴ�");
			 
		 }else { System.out.print("�ƴմϴ�");}
		 
		 if(korean<=20 && korean>=80) {System.out.println("Ư���л��Դϴ�");}
		 else {}
		 
		// TODO Auto-generated method stub

	}

}
