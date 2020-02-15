package cn.itcast.comparedemo;

public class Person implements Comparable{		// crl + 1  ���δʵ�ַ���
	private String name;
	private int age;
	
	public Person() {								// Alt + shift + s
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ������Person�����ж��Ƿ���ͬ�����ݣ� ֻҪ��ͬ��������ͬһ���ˡ�
	 */
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if (this == obj)
			return true;
		if (!(obj instanceof Person)) {
			throw new ClassCastException("���ʹ���");
		}
		
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age == p.age;
		
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * �Ƚ������С�ķ�����
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (!(o instanceof Person)) {
			throw new ClassCastException("���ʹ���");
		}
		Person p = (Person)o;
//		if (this.age > p.age) {
//			return 1;
//		}
//		if (this.age < p.age)
//			return -1;
//		return 0;
		return this.age - p.age;
		
	}
	
	
}
