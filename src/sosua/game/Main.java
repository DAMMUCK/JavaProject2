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
	
	public boolean createCharacter() {
		String name, job;
		long guid;
		System.out.print("이름입력 : ");
		name=scan.next();
		System.out.print("직업입력 : ");
		job = scan.next();
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
