package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	 public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	String best;
	
	

	int max;
	int english;
	int korean;
	int science;
	
	System.out.println("�������� ������ �������ּ���----------");
	System.out.println("����");
	korean = sc.nextInt();
	System.out.println("����");
	english = sc.nextInt();
	System.out.println("����");
	science = sc.nextInt();
	
	if(korean>english) {max = korean; best = "����";}
	else { max = english; best = "����";}
	 if(max<science) {max = science; best = "����";}
	 
	 if (max == korean) {System.out.println("�л��� Ư�� ������ �����Դϴ�" );}
	 if (max == english) {System.out.println("�л��� Ư�� ������ �����Դϴ�" );}
	 if (max == science) {System.out.println("�л��� Ư�� ������ �����Դϴ�" );}
	 
	 System.out.println("�ְ���" + max );
	 System.out.println("����� 3");
	 System.out.println("����" + (english+korean+science) );
	 System.out.println("���" + (english*korean*science/3) );
	 System.out.println("Ư�����" + best );
	
	
	
	 }
	
}
