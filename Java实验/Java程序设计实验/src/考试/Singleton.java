package ����;

public class Singleton {
	private String name;
	private static Singleton man = new Singleton("ke la ke");
	private Singleton(String name)
	{
		this.name = name;
	}
	// ����man�ľ�̬����
	public static Singleton getInstance() {
		return man;
	}
}
