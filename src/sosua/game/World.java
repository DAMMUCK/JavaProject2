package sosua.game;

import java.util.ArrayList;
import java.util.Scanner;

public class World {
	Scanner scan = new Scanner(System.in);
	private ArrayList<Character> charList = new ArrayList<Character>();

	// 캐릭터 이름 중복 안됨
	// 캐릭터 guid를 관리하는 캐릭터 CManager만들기

	public static void main(String[] arg) {
		World world = new World();
		world.run();
	}

	public void printMenu() {
		System.out.println("1.캐릭터 생성");
		System.out.println("2.캐릭터 정보창보기");
		System.out.println("3.캐릭터 선택");
		System.out.println("3.종료");
	}

	public boolean createCharacter() {
		String name, job;
		System.out.print("이름입력 : ");
		name = scan.next();
		System.out.print("직업입력 : ");
		job = scan.next();
		for (Character i : charList) {
			if (name.equals(i.getName())) {
				System.out.println("이미 존재하는 이름입니다!");
				return false;
			}
		}
		Character character = new Character(name, job);
		charList.add(character);
		return true;
	}

	public void viewInfoChar() {
		if (charList.size() == 0) {
			System.out.println("생성된 캐릭터가 없습니다! 캐릭터를 생성해주세요");
		}
		for (Character c : charList) {
			c.viewInfo();
		}
	}

	public void run() {
		boolean roop = true;
		int choice = 0;
		while (roop) {
			printMenu();
			System.out.print("입력 : ");
			choice = scan.nextInt();
			if (choice == 1) {
				if (createCharacter() == true) {
					System.out.println("** 캐릭터가 생성되었습니다!! **");
				}
			} else if (choice == 2) {
				viewInfoChar();
			} else if (choice == 3) {
				roop = false;
			}
		}
	}

}
