package koreait.day11.test;


public class AnimalTest5 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("����A");
		animals[4] = new Frog();
		animals[4].setName("����B");
		animals[6] = new Crow();
	
	int cnt =0;
	long start = System.nanoTime();
	for(Animal temp : animals) {
		if(temp != null && temp instanceof Frog) {
			cnt++;
			System.out.println(temp.eat(100*(cnt+2)));
		}
	}
	long end = System.nanoTime();
	System.out.println("time" +(end-start)+ "ms");
	System.out.println();
	start=System.nanoTime();
	System.out.println("frog eats" + cnt +"flies");
	
	System.out.println("������ �����ֱ�''''''''''''''");
	cnt=0;
	for(Animal temp : animals) {
		if(temp != null && temp.type == Animal.DOG) {
			cnt++;
			System.out.println("puppy treat");
		}
	}
	System.out.println("time" +(end-start)+ "ms");
	System.out.println("" + cnt + "dogs");
	System.out.println(animals[6].eat(animals[3]));

}}
class Frog extends Animal{	//������

	protected String mouth;  //����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
	public Frog() {
		System.out.println("���ο� ���������� Frog");
		type=Animal.FROG;
	}
	
	public void jump() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	}
	
	//������ ���� : �޼ҵ� �������̵�    				*��: �����ε�(overloading) - ���� ã�ƺ���*
	//				�� �θ� Ŭ������ �޼ҵ带 ������. �̶� ���ڿ� ����Ÿ���� �����ϰ� �մϴ�.
	@Override		//annotation �ֳ����̼� : �ڵ�(�Ǵ� ����) �Ҷ� ���� �Ǵ� �ּ�
	public void act() {		
//			super.act();	//�θ�Ŭ������ act() ����
			System.out.println("frog �ൿ : ���÷� �����ϱ� ");
			
	}
	 @Override
		public String eat(Object object) {
			return "���̴� + " + object + "�Դϴ�" ;
			
		}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
abstract class Cat extends Animal{
	protected String eyes;
	public Cat() {
		System.out.println("���ο� ���������� cat" );
		type=Animal.CAT;
	}
	public void sound() {
		setName("�����");
		setColor("ȭ��Ʈ");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	@Override
	public void act() {
		System.out.println("cat �ൿ : ���÷� �߿˾߿� ��� ");
	}
	 @Override
		public String eat(Object object) {
			return "���̴�" + object;
			
		}
}