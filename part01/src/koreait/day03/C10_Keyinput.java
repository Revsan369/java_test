package koreait.day03;

import java.util.Scanner;

public class C10_Keyinput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//Ű���� �Է������� �������� // scanner import by ctrl space then java.util
		
		int data;
		
		System.out.println("������ �Է��ϼ��� ->");//��� ���� �ָ� �ܼ�â�� �ڵ� �˾��� 
		data = sc.nextInt(); //(����) �Է� �ް� 
		System.out.println("�Էµ� ����" + data + "�Դϴ�");
		
		double point;
		System.out.println("�Ǽ� �Է�");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ����" + point + "�Դϴ�");
	}

}
/* 
 * 	ǥ�� ��� : System.out (out-> System class�� ������ �ʵ�)
 *  ǥ�� �Է� : System.in   (in ->System class�� ������ �ʵ�)  -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 						   -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	java.lang�� import ����ȿ ����
 * 
 */
