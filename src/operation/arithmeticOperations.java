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
		System.out.println("<»çÄ¢¿¬»ê °á°ú>  µ¡¼À :"+addition(a,b)+", –E¼À : "
				+subtraction(a,b)+", °ö¼À : "+multiplication(a,b)+", ³ª´°¼À : "+division(a,b));
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
