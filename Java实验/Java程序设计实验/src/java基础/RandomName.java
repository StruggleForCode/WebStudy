package java����;

import java.util.Random;
import java.util.Scanner;

public class RandomName {
	
	static String[] Namestr = new String[100];
	
	public static void main(String[] args) {
		int n;
		System.out.println("����ȫ��һ���ж�����");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		//System.out.println(n);
		
		ScannerName(n);
		PrintName(n);
		Randomname(n);
		sc.close();
		
	}
	
	public static void ScannerName(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("�����" + (i+1) + "���˵�������");
			Namestr[i] = sc.next();
		}	
		sc.close();
	}
	
	public static void PrintName(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("��" + i + "��ѧ����������" + Namestr[i]);
		}
	}
	
	public  static void Randomname(int n) {
		int RandomNumber = new Random().nextInt(n);
		//System.out.println(RandomNumber);
		System.out.println("��㵽����ͬѧ�ǣ�" + Namestr[RandomNumber]);
	}
	
}



//����
//�ŷ�
//����

