package operation;

import java.util.Scanner;

public class arithmeticOperations {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		arithmeticOperations operation = new arithmeticOperations();
		operation.runOperaion();
	}
	public void runOperaion() {
		int a=20;
		double b=10;
		System.out.println("<��Ģ���� ���>  ���� :"+addition(a,b)+", �E�� : "
				+subtraction(a,b)+", ���� : "+multiplication(a,b)+", ������ : "+division(a,b));
	}
	
	public double addition(int a,double b) {
		return a+b;
	}
	
	public double subtraction(int a,double b) {
		return a-b;
	}
	
	public double multiplication(int a, double b) {
		return a*b;
	}
	
	public double division(int a, double b) {
		return a/b;
	}
}
