package ����Ķ�����;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		Animal animal = (Animal)cat;
		if (animal instanceof Cat) {
			Cat cat1 = (Cat)animal;
			cat1.sleep();
		}
		else if (animal instanceof Pig) {
			Pig pig = (Pig)animal;
			pig.sleep();
		}
	}
}


interface Animal{
	public abstract void sleep();
}

class Cat implements Animal{
	public void sleep() {
		System.out.println("è��˯��");
	}
}

class Pig implements Animal{
	public void sleep() {
		System.out.println("����˯��");
	}
}