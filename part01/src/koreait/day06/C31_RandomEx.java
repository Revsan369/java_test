package koreait.day06;

import java.util.Random;
// �ۼ��� ������
public class C31_RandomEx {
public static void main(String[] args) {
	Random r = new Random();
	
	int[] counts= new int[5];
	int[] koreans = new int[10];
	
	for(int i=0;i<koreans.length;i++)
		koreans[i]=r.nextInt(101);
	
	for(int i=0;i<koreans.length;i++) {
		if(koreans[i] >=90) counts[0]++;
		else if (koreans[i] >=80) counts[1]++;
		else if (koreans[i] >=70) counts[2]++;
		else if (koreans[i] >=60) counts[3]++;
		else counts[4]++;
					
	}
//	System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60�̸�");
	System.out.printf("%8s %8s %8s %8s %8s\n","90~100","80~89","70~79","60~69","60�̸�");
    System.out.println("---------------------------------------");
	for(int i=0;i<counts.length;i++) {
		System.out.printf("%8d " ,counts[i]);
	}
	for(int i=0;i<counts.length;i++) {
		System.out.printf("%8.1f%%" ,(double)counts[i]/10*100);
	}
}
}
//���� ��������(����)�ο� 100�� randomm(0<= x<=100)
// �迭 ��� ���(������ ����/���� , ũ�⵵ �����Ƿ� ����)
	//9~100: n��(�Ҽ��� 1�ڸ�%)
	//80~89: n��(�Ҽ��� 1�ڸ�%) ī��Ʈ���� 5��.(�迭���)
	//70~79: n��(�Ҽ��� 1�ڸ�%)
	//60~69: n��(�Ҽ��� 1�ڸ�%)
	//60 �̸�: n��(�Ҽ��� 1�ڸ�%)
