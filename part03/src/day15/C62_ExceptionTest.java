package day15;

import java.util.Scanner;

public class C62_ExceptionTest {
	
	public static void main(String[] args) {
	
		
		
		
		
		//Exception ����3
				Scanner sc = new Scanner(System.in);
				System.out.println(">>> ");
				//int a = sc.nextInt();
				int a = Integer.parseInt(sc.nextLine());
				System.out.println("print  : " + a);//���� ���� ���� �Է½�  java.util.InputMismatchException
				//Ű�����Է��� ������ ��ȯ�ؼ� ������ �����մϴ�.

		
		
		
		//Exception ����2
				int[] nums = new int[5];		//�迭���� : ��� 5���Դϴ�.
				nums[5] =100;
				
	   //Exception ����1
		String message = null; //java.lang.NullPointerException
		char temp = message.charAt(0);   // java.lang.ArrayIndexOutOfBoundsException: ([5]) is upto [4] start with [0]  
				//message ���ڿ����� ù��°(0) ���� 1�� �����ɴϴ�.

		int cnt = message.length();
	}
	


}
/*
Exception ��� : ���������� �ƴմϴ�. �����ϸ鼭 �߻��ϴ� ���� �Դϴ�.(�߻����ɼ��� ����ؼ� ���α׷����ؾ��մϴ�.)
     -> ���ο� ���� �ٸ��̸� XXXXException �� �߻��ϰ� �̵��� Exception Ŭ������ �ڽ� Ŭ�����Դϴ�.
     -> Exception �� ���� �߿� �߻��ϸ� �� ���Ĵ�?..... ���α׷��� �� �������� �ߴܵ˴ϴ�. 
         ����, Exception �� �����ϰ� ���α׷��� �ߴܵ��� �ʵ��� ���α׷� ������ �ؾ��մϴ�.
*/
