package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {
 public static void main(String[] args) {
	
	 String messge = "hi java!"; // message = ��������
	 
	 String[] engKey = {"continue", "break", "public", "static", "dynamic"};
	 // int,double,char �迭������ ��Ҹ� ��Ÿ�״� nums[2], carr[2], point[2] >>> �⺻��
	 //engKey Qnsakey�Ӹ��ƴ϶� engKey[2] �� String ������
	 
	 for(int i=0;i<engKey.length;i++)
		 System.out.println(engKey[i]);
	 
	 String[] koreans = new String[5]; //�⺻�� ������ ����x ����������
	 
	 for(int i=0;i<koreans.length;i++)
		 System.out.println(koreans[i]);//�ʱⰪ�� ��� �����Ұ��� ���� null
	 
	 System.out.println("1. engKey �迭��Ұ� ���� ���ڿ��� ����");
	 for(int i=0;i<engKey.length;i++)
		 System.out.println(engKey[i] + ":" + engKey[i].length());
	 
	 koreans[0]="���";
	 koreans[1]="����";
	 koreans[2]="������";
	
	 System.out.println("2. koreans �迭��Ұ� ���� ���ڿ��� ����");
	 for(int i=0;i<koreans.length;i++)
		 if (koreans[i] != null)//vip
		 System.out.println(koreans[i] + ":" + koreans[i].length());
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("static ��? >>> " );
	 koreans[3] = sc.nextLine();
	
	 System.out.print("dynamic ��? >>> " );
	 koreans[4] = sc.nextLine();
	 
	 System.out.println("3. ��� �Էµ� koreans �迭Ȯ��");
	 for(int i=0;i<koreans.length;i++)
		 System.out.println(koreans[i]);
	 
	 //����ڰ� �Է��� ���ܾ engKey  �迭�� ���°?
	 System.out.print("ã���ܾ�� >>> ");
	 String find =sc.nextLine();
	 
	 int i;
	 for(i=0;i<engKey.length;i++) {
		 if(find.equals(engKey[i]))
				 break; //i=0~ engKey.length-1
		 
		 System.out.println("ã�� �ܾ���ġ" + i);
	  if(i==engKey.length)
	 System.out.println("����");
		 else
		 System.out.println("�ѱ۶�" + koreans[i]);
		 
		 if(i==-1)
			 System.out.println("ã�´ܾ �����ϴ�");
	 }
//	 int index=-1;
//	 
//	 for(int i=0;i<engKey.length;i++) {
//		 if(find.equals(engKey[i])) {
//			 index = i;
//			 break;
//		 }
//		 
//	 }
//	 System.out.println("ã�� �ܾ���ġ" + index);
//	 if(index==-1)
//	 System.out.println("����");
//	 else
//		 System.out.println("�ѱ۶�" + koreans[index]);
//	 
//	 if(index==-1)
//		 System.out.println("ã�´ܾ �����ϴ�");
}
}
