package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {
public static void main(String[] args) {
	
	char[] carr1 = {'i','a','m',' ','j','a','v','a'};
	char[] carr2 = new char[20];
	System.out.println("[[[[char �迭 �׽�Ʈ -1 ]]]]");
	System.out.println("carr1 : " + Arrays.toString(carr1));
	System.out.println("carr2 : " + Arrays.toString(carr2));//0= ��ĭ 
	System.out.println("carr1 �迭ũ�� : " + carr1.length);
	System.out.println("carr2 �迭ũ�� : " + carr2.length);
	
	System.out.println("carr1 3���� �����Ͱ�(����)" + carr1[2]); 
	System.out.println("carr2 3���� �����Ͱ�(����)" + carr2[2]);//0= ��ĭ
	
	System.out.println("carr1 3���� �����Ͱ�(����)" + (int)carr1[2]); 
	System.out.println("carr2 3���� �����Ͱ�(����)" + (int)carr2[2]);//0= �⺻ �ʱⰪ
	
    
	System.out.println("\n[[[[char qoduf 2");
	System.out.println("1. for���Ƿ� ���");
	for(int i=0;i<carr1.length;i++) {
	System.out.println(carr1[i]);}
	
	System.out.println("\n2. for");
	for(int i=0;i<carr1.length;i++) {
		System.out.println(carr1[i]);
	}
	System.out.println("\n3. ");
	System.out.println(carr1);
	
	String msg = "I am java";
	System.out.println(msg);
	
	carr2 = "hello hi goodbye".toCharArray();
	System.out.println(carr2);
	System.out.println(carr2[2]);
	System.out.println("carr2.length : " + carr2.length);//16
	
	carr2 = "hello hi goodbye hi goodbye".toCharArray();// ����迭����ŭ
	System.out.println("carr2.length : " + carr2.length);//27 �迭ũ�� Ȯ��
	
	String temp  = String.valueOf(carr2); //char[] �迭�� ���ڿ��� ��ȯ String.toCharArray()�� ����
	
	System.out.println("String.valueOf(carr2) : " +String.copyValueOf(carr2));
	System.out.println("String.valueOf(carr2) : " + temp);
}
}
