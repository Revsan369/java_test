package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {
public static void main(String[] args) {
	//if(){...} else if {}.....else/if
	
	Scanner sc = new Scanner(System.in);
	int money;
	int pay;
	double rate;
	System.out.print("���� �ݾ���");
	pay = sc.nextInt();
	
	if(pay >=100000) 
		rate = 0.1;
	else if(pay >=70000)
		rate = 0.09;
	if(pay >=40000)
		rate = 0.07;
	else rate = 0.03;
	
	money = (int)(pay * rate);
	System.out.printf("����! ���� �׸��Ͻ� �ݾ��� �������� %d�� �Դϴ�.\n",money);
	System.out.printf("�̺�Ʈ �Ⱓ ������ %d %% ����Ǿ����ϴ�",(int)(rate*100));
	
	sc.close();
		
	}}
	
	
	


