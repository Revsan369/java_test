package koreait.day11;
//�߻�Ŭ���� : ��ü�� ������������ �ʴ� ������ Ŭ���� �Դϴ�. new x
//�߻�޼ҵ带 ���� �ֽ��ϴ�. �߻�(abstract): ��üȭ���� ���� ����.
//�θ�Ŭ�������� ��üȭ���� ���� �߻�޼ҵ带 �ڽ�Ŭ������ ������(�������̵�)�ϵ��� �ϴ� ���Դϴ�.
//'person' is abstract 'son heungmin'not 
public abstract class  ClassAbs {

	 protected String name;//c class can be used from dif class 
	 public abstract void test();
	 
	 public void print() {
		 System.out.println("name" + name);
	 }
	 
	 public String getName() {
		 return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
}
