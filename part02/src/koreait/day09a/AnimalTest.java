package koreait.day09a;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("------------------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print();
		System.out.println("---------------------------------");
		
		Crow crow =new Crow(); 
			crow.fly();
			crow.print();
			
			System.out.println("============================");
			Animal temp = dog;
			temp.print();
			//temp.run();
			temp.print();
			temp= crow;
			temp.print();
			
			Animal puppy = new Dog();
			puppy.print();
			//puppy.run(); �θ�� �ڽ� �Ұ�
			
			Dog puddle = (Dog)puppy;//Animal Ÿ���� Dog Ÿ���Ƿ� ���� casting(�ڽ�Ŭ���� Dog ��ü�̹Ƿ� ����)
		    puddle.print();     //puppy ������ �����ϴ� ��ü�� Dog Ÿ���϶��� ����
	}

}
