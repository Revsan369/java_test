package koreait.day05;
public class C32_forTest {
public static void main(String[] args) {
	
	

		//��ɹ��� �ݺ�1  5�� �ݺ�
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");

		
		//��ɹ��� �ݺ�2 �� �����ϰ� 5�� �ݺ�
		System.out.println("hello!(1)");
		System.out.println("hello!(2)");
		System.out.println("hello!(3)");
		System.out.println("hello!(4)");
		System.out.println("hello!(5)");
		// ���� ���� ������ �ݺ��� ���
		
//		for(�����ʱⰪ;�������ǽ�;������)	 //������ loop counter (�ݺ��� ������)	
		for(int i=0;i<5;i++)	{		//i�� for() �ȿ��� �����ϸ� for������ ����Ҽ� �ֽ��ϴ�.(for { }�� ��������)
			//i�� 0���� 4���� ����Ǹ鼭 �����մϴ�.
			System.out.println("��ο� !");		//i=0 , 0<5 �� -> ��� ���� -> i++
			System.out.println(i);
			System.out.println("////////");		//i=1 , 1<5 �� ->    " -> i++
		}						                //i=2, 2<5 �� ->     "    -> i++
								//	:
								//i=5, 5<5 ���� -> for����

		//�ٸ� ����
		for(int i=0;i<10;i+=2)			//�����?
			System.out.println("Hello!!!!!");  
		
		for(int i=0;i<0;i++) 			//�����?
			System.out.println("��ο�!!!!!");
		
		for(int i=10;i>0;i--) {			//�����?
			System.out.println("��ο�!");
		    System.out.println(i);
		    System.out.println("////////");	
		    
		    
		
		}
		
		for(int i = 0; i<5; i++)//loop(;;)
			System.out.println("hello!"+(i+1)+")");//;
		//����/�������� ex for(int i=10;i>0;i++) ���ѷ�Ʈ ==> for(int i=10;i>0;i--)������

		// �� ��ɹ��� �ݺ�2�� for�� ����غ�����.

	
}}

