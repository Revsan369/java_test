package koreait.day08b;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
public static void main(String[] args) {
	
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int[] triallst = new int[10];
	String trailstr;
	int max = 10;
	
	System.out.println("���� ���߱� ���� ���� �����߽��ϴ�");
	System.out.println("�� �޸��� ���纸����(101 ~ 299)");
	int numComputrer = r.nextInt(199) +101;
	int numHuman;
	int i =0;
	do {System.out.print("�����Է� ( ��ȸ" +(max-i)+ ")->");
	numHuman = sc.nextInt();
	if (numHuman < numHuman) {
		triallst[i] = numHuman;
		i++;
		System.out.println("�ƴմϴ� ��ū ���Դϴ�");}
		else if(numHuman > numHuman) {
			triallst[i] = numHuman;
			System.out.println("�ƴմϴ� ������ ���Դϴ�");}
			
	if (i==max) { break;
	
	}while(numComputrer != numHuman);
	if (i==max) {
	
				System.out.println("�޸� �Է³��� :" + Arrays.toString(triallst));
				System.out.println("��ȸ �پ��̱޴ϴ�");}
				
			else 
				System.out.println("�G����ϴ�.�������� �õ� Ƚ��" + (i+1));
		
	}while(sc.nextInt()==0);
	
	System.out.println(";;;;;;game score;;;;;;;");
	
	System.out.println(";;;;;;;the end;;;;;;;;");
	sc.close();
}
}
