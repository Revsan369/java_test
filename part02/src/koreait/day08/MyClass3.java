package koreait.day08;

public class MyClass3 {

	public class getInstance extends MyClass3 {

	}
	private static MyClass3 my = new MyClass3();
	
	private MyClass3() {// �����ڴ� private 
		
		}
	public static  MyClass3 getInstance() {
		return my;
	}
	public void test() {
		System.out.println("�̷��� ��ü���� �����ϴ� Ŭ������ ��ü 1���� ����");
		
	}
	public static void staticTest() {
		System.out.println("��ü�ͤ� ��� ���� static");
	}
}
