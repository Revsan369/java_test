package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] n1= new int[5];
		int[] n2= new int[5];
		int count=1;
		int ans = 0;
		int cnt=0; 
		
	
		System.out.println("-----------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� Ǯ��");
		System.out.println("-----------------------------------------");
		System.out.println("�����մϴ�");
		
		
		for(int i=0;i<n1.length;i++) {
		n1[i] = r.nextInt(91)+10;
	    n2[i] = r.nextInt(91)+10;
			System.out.print("����" + count++ +"." + n1[i]+"+" +n2[i] +"���Է�->" );
			ans=	n1[i]+n2[i];
		int an = sc.nextInt();  
		if(ans == an) {cnt++;}
		
		System.out.println("---------------------------------");
		System.out.println("ü���մϴ�. ��������" + cnt);
	
		
		if(ans != an) {
		
			
			System.out.print("Ʋ�� ���� ����");
		 System.out.println("����" + count +"= "+ ans );}
			
		
			
			
			}sc.close();
		}
		
}	
				
			
	
		
		       
		
	
	

