package koreait.day07;
//C39
public class Student {

	int no;
	int grade;
	String name;
	Score score;
	//���ڷ� ���޹޴� ������ ��������(�ʵ� ��ü�� Ư������Ÿ�״� �������)�� ����
	void setData(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", grade=" + grade + ", name=" + name + ", score=" + score + "]";
	}
}
