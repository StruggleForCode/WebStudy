package Class;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.pringName();
		dog.shout();
		

	}

}


class Animal{
	public String name = "����";
	public void shout() {
		System.out.println("���﷢������");
	}
}


class Dog extends Animal{
	public String name = "Ȯ��";
	public void shout() {
		System.out.println("���Ľ���");
	}
	public void pringName() {
		System.out.println("name = " + super.name);
	}
}