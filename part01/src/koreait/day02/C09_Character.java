package koreait.day02;

public class C09_Character {
public static void main(String[] args) {
 
	char c1 ='a'; //char�� ������ �Ǵ� '1����'
	char c2 = 97;// char= number char = 'a'
	
	System.out.println("c1 =" + c1);
	System.out.println("c2 =" + c2);
	
	//System.out.printf("c1= %d\n",c1 ); // char ���� %d �Ұ�
	
	System.out.printf("c1= %d\n",(int)c1);
	System.out.printf("c1= %d\n",(int)c2);// �Ѵ� 97 ���
	
	c1 = (char)(c1 + 1);
	System.out.println("c1 =" + c1); // next char
	
	c1++;  //++ ������ c1 = c1+1

	System.out.println("c1 =" + c1); //auto casting
	
	char h1 = '��';
	char h2 = 44032;
	char h3 = '\uac00'; // \\u�� 16���������ڵ�

	System.out.println("h1 =" + h1);
	System.out.println("h2 =" + h2);
	System.out.println("h3 =" + h3);
	
	System.out.printf("h1= %d\n",(int)h1);
	System.out.printf("h2= %d\n",(int)h2);
	System.out.printf("h3= %d\n",(int)h3);
	
	h1++;

	System.out.println("h1 =" + h1);
	
	h1++;
	System.out.println("h1 =" + h1);
	//�ѱ� ������ ����
	char h4 = 55203;
	char h5 ='\ud7a3';
	System.out.println("h4 =" + h4);
	System.out.println("h5 =" + h5);
	
	h4++;
	System.out.println("h4 =" + h4); //���ھ�� (?) 
	
	h5--;
	System.out.println("h5 =" + h5);
	System.out.println('H' + 'e'+ 'l'+ 'l' + 'o'); // �迭�� ó�������ʾ� �� ���� �ڵ尪�� ���Ѱ� ���ڿ��� ������� �迭�� ó���ؾ���
	
	
	//char�� �𿩼� ���ٷ� �����ϸ� -> ���ڿ� (class�� ������ �ٷ����) ex "hello" = 'h','e','l','l','o'
	

}
}
/* ������  �⺻ ���� : ������ char
 * * ���ڵ����͸� ���ϴ� 2����Ʈ ����. ������ 0~ 65535 ���� ���嵵 ����
 *   ��Ǫ�Ϳ��� �ٷ�� �����ڵ�� ó���Ǵ´� �ڵ�� ������
 *   ���� �����ϴ� '' ��ȣ���
 *   
 *   ���� ���� Ư�����ڴ� 
 *   
 *   
 */
 