package koreait.day07;



public class C35_GlobalVar {
	//local var method for if while ���{} ���� ����Ⱥ���. ����� ������� ����
	//global var Class{}���� ���� >>> ���� ��ġ�� ����
	//Class.���� (�̶� ������ ��������)
	//��ä�� ����� ����ϴ� this.������(�ν��Ͻ� ����)
	//���������� Ŭ���� �Ǵ� ��ü�l �漺�� ��Ÿ�ڶ� �ʵ�(.field property) 
	static int num;
	String message;
	int count;
	static double point;
	static final int TEST = 9999;// ��� �ʱ�ȭ���ϸ� ����
	//��� test
	
	
	
	public static void main(String[] args) {// static �� static �� ����
		int num =10;
		System.out.println("num = " + num);
		methodB();
		//methodA(); //static 
		
		//System.out.println("message = " + message);// static �� �ƴѺ��� ���Ұ�
		
		}
	
		
	public void methodA() {
		int num = 99;
		System.out.println("num = " + num);
		System.out.println("message = " + message);
	}

	public static void methodB() {
		int num = 77;
		System.out.println("num = " + num);
		System.out.println("num = " + C35_GlobalVar.num);//Integer.BYTES �� ���� ����
		//���������� ����� num.  Static �϶��� Ŭ�����̸�.������ / staticdl �� �ƴϸ� this.����
		
		
		}
	public void methodC(int count) {
		this.count=count;
}
	
}
