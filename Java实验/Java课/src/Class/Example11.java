package Class;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog_Tow dog = new Dog_Tow();
//		dog.breathe();
//		dog.run();
//		dog.liveOnLand();
		
		Animal_Tow ant = new Dog_Tow();
		Animal_Tow ant1 = new Cat();
		
		animalShout(ant);
		animalShout(ant1);
		
		
	}
	
	private static void animalShout(Animal_Tow an) {
		an.shout();
	}
	
}



//interface Animal_Tow{
//	public static final int ID = 1;
//	public abstract void breathe();
//	public abstract void run();
//}

//interface Animal_Tow{
//	public static final int ID = 1;
//	public abstract void breathe();
//	public abstract void run();
//}
//
//interface LandAnimal extends Animal_Tow{
//	public abstract void liveOnLand();
//}
//
//class Dog_Tow implements LandAnimal{
//	public void breathe() {
//		System.out.println("���ں���");
//	}
//	public void run() {
//		System.out.println("������");
//	}
//	
//	public void liveOnLand() {
//		System.out.println("��������½����");
//	}
//}




interface Animal_Tow{
	void shout();
}

class Cat implements Animal_Tow{
	public void shout() {
		System.out.println("è�Ľ���");
	}
}

class Dog_Tow implements Animal_Tow{
	public void shout() {
		System.out.println("���Ľ���");
	}
}


