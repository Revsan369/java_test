package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
public static void main(String[] args) {
	int[] datas = {45,23,7,21,19,11,44};	//�迭�� �����Ҷ� �迭�� ũ�⸦ ���մϴ�.(����)
	//�迭�� �⺻�� ������Ÿ�� int,double,long.... �Ǵ� ������ Ÿ��

ArrayList<Integer> list = new ArrayList<>();
//ArrayList�� ũ�Ⱑ �����Դϴ�.
//������ Ÿ����  ������Ÿ�Ը� �Դϴ�. �⺻���� ����Ŭ������ ����մϴ�.
//<E> �� ���ʸ� Ÿ���̶�� �θ��ϴ�.������ ����� Ÿ���� ���մϴ�. Generic 

String[] names = {"����","���","�ź�","����","����"};
ArrayList<String> name_list = new ArrayList<>();


//ArrayList�� ������ �߰��� add() �޼ҵ�
list.add(45);
list.add(7);
list.add(21);list.add(19); list.add(11); list.add(44);

System.out.println("ù��° ArrayList<Integer> ���");
System.out.println(list);
//System.out.println("����(�迭) : "  + Arrays.toString(datas));
System.out.println("list = " + list.size());
System.out.println("2nd ArrayList " );
System.out.println(name_list);
System.out.println("list size" + name_list.size());

name_list.add("����");name_list.add("���");
name_list.add("����");name_list.add("����");
System.out.println("String");
System.out.println(name_list);
System.out.println("size" +name_list.size());

System.out.println("Ʈ����ġ ������ �߰�");
list.add(1,23);
System.out.println("add(1,23) " + list);
name_list.add(2, "�ź�");
System.out.println("add() " + name_list);

System.out.println("");
System.out.println("get(3) "+ list.get(3));
System.out.println(" " + name_list.get(3));

System.out.println("remove");
list.remove(4);
name_list.remove(4);
System.out.println("remove " + list);
System.out.println("remove " + name_list);

System.out.println("\n6.Ư���� �˾Ƴ���");
System.out.println("����" + Arrays.binarySearch(names,"�ź�"));
System.out.println("list" + name_list.indexOf("�ź�"));

System.out.println("\n7. 6��");
System.out.println("�迭");
int i=0;
for(i=0;i<names.length;i++)
	if(names[i].equals("�ź�"))
		break;
System.out.println("index" +i);
System.out.println("list");
for(i=0;i<names.length;i++)
	if(name_list.get(i).equals("�ź�"))
		break;
System.out.println("index" +i);
System.out.println("\n8. contains");
System.out.println("����" + name_list.contains("����"));
System.out.println("����" + name_list.contains("����"));
System.out.println("���" + name_list.contains("���"));
// lastIndexof method�� ������ ��ġ��� ã���� ����
}
}
