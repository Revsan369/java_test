package koreait.day06;

import java.util.Arrays;
import java.util.Random;

//�ۼ��� ������
public class C33_RealLotto {
	public static void main(String[] args) {
		int[] numbers =  new int[45];//�������� �ش�Ǵ� �迭
		Random r = new Random();
		
		for(int i=0;i<45;i++) {// �迭 ù��°���� 45��°/i=44���� -> ������ �����°�
		numbers[i]=i+1;// ������ 1~45��> lotto �迭�� ����
		}
			System.out.println("numbers �迭�ʱⰪ----------------------------");
			System.out.println(Arrays.toString(numbers));//���ڿ��� �����ε�
			System.out.println("-----------------------------------");
			
			int[] lotto = new int[6];//���ð� 6�� �ζ�
			int k;//���� ���� �ε��� - ������ ����
			for(int cnt=0;cnt<6;cnt++) { //lotto��ȣ 6���� ���ϱ����� for��
				k=r.nextInt(45-cnt);
				//cnt= 0,1,2,3,4,5 ������ ������ bound ���� 45,44,43,42,41,40 -> �ߺ� ����
				//k�� ���� ����? 0~44, 0,43,0~42...0,39
				System.out.println("k= " +k + "number =" + numbers[k]);//���� ��ȣ ��� k=�迭 ��� ��ġ number= k ���� ������
				
				lotto[cnt]=numbers[k];//numbers �迭���� ������ ���� �δ콺k�� �� ����
				
				//k ��ġ������ : �ε��� k+1 ���� ��������ұ��� �����Ƿ� �̵�
				for(int i=k;i<numbers.length-1;i++) {//�ߺ�����
					numbers[i]=numbers[i+1];
				}
				System.out.println(Arrays.toString(numbers));//numbers ���ڿ��� �����ε�
			}
			System.out.print("���� ���� ���� : ");
			System.out.println(Arrays.toString(lotto));// ���ڿ����·� �ζ� ��ȣ ���]
			
			//System.out.println(lotto);
			//�׳� lotto ��½� �ĺ��Ұ� 10������ ��µ� ex(I@6f75e721)
			
			Arrays.sort(lotto);//�ζǰ� ������� ����(����)
			System.out.println(Arrays.toString(lotto));//������ ��String�Ƿ� �����ε��� lotto�� ���
		}
		
	}


