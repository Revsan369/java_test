package koreait.day11.test;

public class Dog extends Animal{
	protected int legs;
	
	public Dog() {
		System.out.println("���ο� ���������� dog" );
		type=Animal.DOG;
	}
	
	
	public void run() {
		setName("������");
		setColor("����");
		System.out.println("Ư¡ : �޸���");
	}
	@Override
	public void act() {
		System.out.println("Dog eats twie a day");
		
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
