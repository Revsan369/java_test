package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
 public static void main(String[] args) {
	Random r = new Random(); // ��ü �ļ�
	
	System.out.println("1. ������ ������ 10�� ���");
	for(int i=0;i<10;i++) {
		int inum = r.nextInt();
		System.out.println(inum);
	}
	System.out.println("2. ������ ������ 10�� ��� - bound");
	for(int i=0;i<10;i++) {
		int inum = r.nextInt(100);//0<= ���� <100
		System.out.println(inum);}//bound �� ������� ���� �ƴϸ� ���� ���
	System.out.println("3. ������ ������ 10�� ��� - bound");
	for(int i=0;i<10;i++) {
		int inum = r.nextInt(100)+1;// 1 <= n <101
		System.out.println(inum);}
	
	System.out.println("4. 2~45 �ζ� ���� 10��");//int inum = r.nextInt(m-n)+n;>>> n=<x<m
	for(int i=0;i<10;i++) {
		int inum = r.nextInt(44)+2;
		System.out.println(inum);
	}
}
 
}
