package java����;

public class Person {
	String name = "xiao��";
	public Person(String name) {
		name = "xiao��";
	}
	public void show() {
		this.name = "xiao��";
	}
	public static void main(String[] args) {
		Person p = new Person("xiao��");
		System.out.print(p.name);
		p.show();
		System.out.print(p.name);
	}
	
}
