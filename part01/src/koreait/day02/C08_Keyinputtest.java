package koreait.day02;
// java ������ class�� ���ϸ� ����
public class C08_Keyinputtest {
public static void main(String[] args) {
	
	 System.out.println("�簢����");
	 int width = 23;
	 int height = 19;
	 int box_area = width*height;
	 System.out.println("����:" + width + "cm");
	 System.out.println("����:" + height + "cm");
	 System.out.println("����:" + box_area + "cm^2");
	 
	 
	 System.out.println("==========================");
	 
	 System.out.println("������ ���ϱ�-----------------------");
	 final double PI = 3.14;
	 double diameter = 23.230;
	 double round = 2* PI * diameter;
	 double area = PI * diameter * diameter ;
	 
	System.out.printf("������ : %.3fcmn", diameter );
	System.out.printf("������ : %.3fcmWn", round );
	System.out.printf("������ : %.3fcmWn", area);
	
	
	// System.out.printf("%d * %d * %d = %f\n",p,c,t, t * p * c);
	// System.out.printf("%d * %d  * %d = %f\n",p,c,t, p * c*c);
}
}
