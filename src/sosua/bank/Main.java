package sosua.bank;

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("�ﰢ�� : A=3 , B=4, C=5");
		Triangle triangle = new Triangle(3,4,5);
		System.out.println("�ѷ����� : "+triangle.lengthTriangle());
		triangle.drawTriangle();
	}
}
