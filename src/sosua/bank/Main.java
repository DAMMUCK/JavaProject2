package sosua.bank;

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("삼각형 : A=3 , B=4, C=5");
		Triangle triangle = new Triangle(3,4,5);
		System.out.println("둘레길이 : "+triangle.lengthTriangle());
		triangle.drawTriangle();
	}
}
