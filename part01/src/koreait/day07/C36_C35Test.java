package koreait.day07;


public class C36_C35Test {
public static void main(String[] args) {
	//test1 test2 ��������
	C35_GlobalVar test1 = new C35_GlobalVar();
	C35_GlobalVar test2 = new C35_GlobalVar();
	//C35class ����  static 
	test1.count =10;
	test2.count =20;
	
	test1.message ="hi test1";
	test2.message = "hello test2";
	
	test1.methodA();// �ν��Ͻ� �޼ҵ�
	test2.methodA();
	
	test1.methodC(123); //this.count���� this sms test1
	test2.methodC(999); //
	
	System.out.println("test1.count = " + test1.count);
	System.out.println("test2.count = " + test2.count);
	
	//static ��� �׽�Ʈ static �����ɤ� �޼ҵ� �� Ŭ���� �̸��Ƿ� ���
	
		C35_GlobalVar.num=101;
		System.out.println("static num = " + C35_GlobalVar.num);
		System.out.println("static num = " + test1.num);
		System.out.println("static num = " + test2.num);
		
		System.out.println("TEST = " + C35_GlobalVar.TEST);
		
		C35_GlobalVar test3 = new C35_GlobalVar();
		System.out.println("test3.count= " + test3.count);
		System.out.println("test3.message= " + test3.message);
		System.out.println("C35_GlobalVar.point= " + C35_GlobalVar.point);
		
	//static�� ����Ǵ� �޸� ����(�޼ҵ�) ��ü��(��)
}
}
