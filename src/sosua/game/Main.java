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
		System.out.println("1.캐릭터 생성");
		System.out.println("2.캐릭터 정보창보기");
	
	}
	
	/*
	 * public String choiceJob() { int choice =0; String job="";
	 * System.out.println("1| 검사 2| 힐러 3| 암살자 4| 궁사 "); System.out.print("직업입력 : ");
	 * if(choice == 1) {job = "검사";} else if(choice == 2) {job = "힐러";} else
	 * if(choice == 3) {job = "암살자"; } else if(choice == 4) {job = "궁사";} return
	 * job; }
	 */	
	public boolean createCharacter() {
		String name, job;
		long guid;
		System.out.print("이름입력 : ");
		name=scan.next();
		System.out.print("직업입력 : ");
		job=scan.next();
		//job = choiceJob();
		System.out.println("guid입력 : ");
		guid=scan.nextLong();
		for(Character i : charList) {
			if(name.equals(i.getName())) {	
				System.out.println("이미 존재하는 이름입니다!");
				return false;	
			}if(guid == i.getGuid()) {	
				System.out.println("이미 존재하는 guid입니다.");
				return false;	
			}
		}
		Character character = new Character(name,job,guid);
		charList.add(character);
		return true;
	}
	
	public void viewInfoChar() {
		if(charList.size()==0) {System.out.println("생성된 캐릭터가 없습니다! 캐릭터를 생성해주세요");}
		for(Character c : charList) {
			c.viewInfo();
		}
	}
	
	
	public void run() {
		boolean roop=true;
		int choice=0;
		while(roop) {
			printMenu();
			System.out.print("입력 : ");
			choice = scan.nextInt();
			if(choice==1) {
				if(createCharacter()==true) {
					System.out.println("** 캐릭터가 생성되었습니다!! **");
				}
			}
			else if(choice==2) {viewInfoChar();}
			else if(choice==3) {roop=false;}
		}
	}

}
