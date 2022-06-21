package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog();
		Animal ani2 = new Cat();
		
		Dog puddle =new Dog();
		Crow crow = new Crow();
		
		Dog dog = new Dog();
		
		System.out.println("::::::::::::");
		 //animal(ani1);
		 animal(ani2);
		 //animal(puddle);
		 //animal(crow);
		 //animal(new Frog());
	}
	public static void animal(Animal animal) {
		
		animal.act();
		
		animal.print();
		System.out.println("dog ?" +(animal instanceof Dog));
		System.out.println("crow ?" +(animal instanceof Crow));
		System.out.println("frog ?" +(animal instanceof Frog));
		System.out.println("cat ?" +(animal instanceof Cat));
		
		//animal.jump(); -Frog
		//animal.run();  -Dog
		//animal.fly();  -Crow
		//animal.sound(); - cat
		
		Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
			cat = (Cat)animal;cat.sound();
		}
		if(animal instanceof Dog) {
			dog = (Dog)animal;dog.run();}
		
		if(animal instanceof Crow) {
			crow = (Crow)animal;crow.fly();
		}
		if(animal instanceof Frog) {
			frog = (Frog)animal;frog.jump();
			}animal.print();
		}
	}//animal �޼ҵ��� end
		
		class Frog extends Animal{
			
			protected int legs;
			
			public void jump() {
				System.out.println("�������� frog");
				setName("������");
				setColor("�ʷ�");
				System.out.println("Ʊ¡: ����" );
			}
			@Override
			public void act() {
				//super.act();
				System.out.println("Animal act jumping");
			}
			}
		class Cat extends Animal {
			
			
			protected String eyes;
			
			public Cat () {
				System.out.println("�������� dog");}
			public void sound() {
				setName("������");
				setColor("������");
				System.out.println("Ư¡ : �޸���");
			}
			@Override
			public void act() {
				System.out.println("Animal act sound");
			}
			}

	


