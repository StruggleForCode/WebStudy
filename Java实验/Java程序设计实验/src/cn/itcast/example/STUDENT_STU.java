package cn.itcast.example;

public class STUDENT_STU {
	int id;
	String name;
	double score;
	
	public STUDENT_STU(int id, String name, double score){
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public void Evaluation() {
		if(score > 90) {
			System.out.println("����ѧ��");
		}
		else {
			System.out.println("��ͨѧ��");
		}
	}

}
