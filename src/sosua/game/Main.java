package sosua.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	private ArrayList<Character> charList = new ArrayList<Character>();
	
	
	public static void main(String[] arg) {
		Main main = new Main();
		main.run();
	}
	
	public void printMenu() {
		System.out.println("1.ĳ���� ����");
		System.out.println("2.ĳ���� ����â����");
	
	}
	
	public boolean createCharacter() {
		String name, job;
		long guid;
		System.out.print("�̸��Է� : ");
		name=scan.next();
		System.out.print("�����Է� : ");
		job = scan.next();
		System.out.println("guid�Է� : ");
		guid=scan.nextLong();
		for(Character i : charList) {
			if(name.equals(i.getName())) {	
				System.out.println("�̹� �����ϴ� �̸��Դϴ�!");
				return false;	
			}if(guid == i.getGuid()) {	
				System.out.println("�̹� �����ϴ� guid�Դϴ�.");
				return false;	
			}
		}
		Character character = new Character(name,job,guid);
		charList.add(character);
		return true;
	}
	
	
	public void run() {
		boolean roop=true;
		int choice=0;
		while(roop) {
			choice = scan.nextInt();
			if(choice==1) {createCharacter();}
			else if(choice==2) {}
			else if(choice==3) {roop=false;}
		}
	}

}
