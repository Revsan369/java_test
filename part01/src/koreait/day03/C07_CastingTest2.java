package koreait.day03;

public class C07_CastingTest2 {
 public static void main(String[] args) {
	
	 //���Թ� : �����ʰ� ������ ��Ӥ��ʺ����� ���� ���Ŀ� ���Ǵ� ������ ������ ����
	 //   ������� +,-,/(��������),%(������)�Ǽ����길 ����x
	 //���迬�� ==(����,����) , =(�����ʴ�),>,<,
	 // ������ &&(and,�׸��� ),||(or), !(not)
	 
	 // �������� ������ int(default)if not applicable ...
	 
	 int a = 9, b = 3; //���� 
	 double c = 10.99; // 
	 
	 int isum;
	 double bsum;
	 
	 isum = a+b;
	 bsum = a+c;
	 
	 System.out.println("a + b =" + isum);
	 System.out.println("a + c =" + bsum);
	 
	// isum = a + c; //(Casting) cannot convert double to int if needed (casting)����ȯ  �Ǽ��� ������ ��ȯ
	 isum = a + (int)c;//�̋� �Ҽ��� �Ʒ� ���� �ݿø� ���� ����
	 
	 System.out.println("a + c(int) =" + isum);
	 
	 System.out.println("a/b =" + (a/b));
	 System.out.println("a%b =" + (a%b));
	
	 System.out.printf("%d / %d = %d\n", a,b,a/b);
	 System.out.printf("%d %% %d = %d\n", a,b,a%b); //%�� 1���϶� �����Ƿ� �ν��ؼ� 2�������
	
	 // ��������ȯ(����casting ) ���� ��/���� �Ǽ��� ���ϴ� ó�������϶� int/int==> int/double
	 
	 //System.out.printf("%d / %d = %s\n", a, b, (double)a / b);//()�� ��ȯ //�Ǽ� ���� ���ڿ��� %f %s�� ���ڿ� 
	 System.out.printf("%d / %d = %f\n", a, b, (double)a / b);//()�� ��ȯ //�Ǽ� ���� ���ڿ��� %f %s�� ���ڿ� 
	 System.out.printf("%d / %d = %.2f\n", a, b, (double)a / b);//%.n �� �Ҽ��� �� // �⺻%f�϶� 6�� but 0�̱⶧���� �ǹ̴� ����
	 //System.out.printf("%d / %d = %d\n", a, b, (double)a / b);//���� %d�� ���� �̱⶧����
	 
	 double test =12.3456789123456;
	  System.out.println("test =" + test);
	  System.out.printf("test = %f\n", test);
	  System.out.printf("test = %.15f\n", test);
	 
	 
	 
			 
}
}
